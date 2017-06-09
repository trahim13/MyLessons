package JDBC;

import java.sql.*;

public class JDBC198 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String USER = "root";
        final String PASSWORD = "root";
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement st=con.createStatement()) {

            con.setAutoCommit(false);

            st.execute("drop table if exists JDBC198");
            st.executeUpdate("create table if not exists JDBC198 (id mediumint auto_increment not null, name CHAR(30) not null, primary key(id))");

            st.executeUpdate("insert into JDBC198 (name) values ('value one')");
            Savepoint savepoint = con.setSavepoint();
            st.executeUpdate("insert into JDBC198 (name) values ('value two')");

//            con.commit();
            con.rollback(savepoint);

            con.commit();



        }



    }
}
