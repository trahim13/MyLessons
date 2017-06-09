package JDBC;


import java.sql.*;

public class JDBC200_3 {
    static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws InterruptedException {

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {
            con.setAutoCommit(false);
            con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            ResultSet resultSet = st.executeQuery("select count(*) from JDBC200");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));

            }


            new OtherTrasaction().start();
            Thread.sleep(2_000);


            ResultSet resultSet1 = st.executeQuery("select count(*) from JDBC200");
            while (resultSet1.next()) {
                System.out.println(resultSet1.getInt(1));

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

                con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
                st.executeUpdate("insert into JDBC200 (name) values ('same new value - FANTOM')");

                con.commit();


            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
    }

}
