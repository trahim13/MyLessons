package JDBC;


import java.sql.*;

public class JDBC200 {
    static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {
            con.setAutoCommit(false);
            con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
//            st.execute("drop table if exists JDBC200");
//            st.executeUpdate("create table if not exists JDBC200(id mediumint auto_increment not null, name CHAR(30) not null, primary key(id))");
//            st.executeUpdate("insert into JDBC200 (name) values ('deufault value')");

            Savepoint savepoint = con.setSavepoint();
            st.executeUpdate("update JDBC200 set name = 'new value' where id = 1");
//            st.executeUpdate("insert into JDBC200 (name) values ('second deufault value')");




            new OtherTrasaction().start();
            Thread.sleep(2_000);
//            con.rollback();
            con.rollback(savepoint);
            con.commit();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static class OtherTrasaction extends Thread {
        @Override
        public void run() {
            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                 Statement st = con.createStatement()) {
                con.setAutoCommit(false);

                con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
                ResultSet resultSet = st.executeQuery("select * from JDBC200");
                while (resultSet.next()) {
//                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getString("name"));


                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
