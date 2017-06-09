package JDBC;


import java.sql.*;

public class JDBC200_2 {
    static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws InterruptedException {

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {
            con.setAutoCommit(false);
            con.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);

            ResultSet resultSet = st.executeQuery("select * from JDBC200");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));

            }


            new OtherTrasaction().start();
            Thread.sleep(2_000);


            ResultSet resultSet1 = st.executeQuery("select * from JDBC200");
            while (resultSet1.next()) {
                System.out.println(resultSet1.getString("name"));

            }


        } catch (SQLException e) {
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
                st.executeUpdate("update JDBC200 set name = 'new value' where id =1");
                con.commit();


                } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
    }

}
