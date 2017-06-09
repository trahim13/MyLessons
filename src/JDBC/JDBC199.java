package JDBC;


import java.sql.*;

public class JDBC199 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String USER = "root";
        final String PASSWORD = "root";
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {
            con.setAutoCommit(false);
            st.addBatch("drop table if exists JDBC199");
            st.addBatch("create table if not exists JDBC199 (id mediumint auto_increment not null, name CHAR(30) not null, primary key(id))");
            st.addBatch("insert into JDBC199 (name) values ('value one')");
            st.addBatch("insert into JDBC199 (name) values ('value two')");
            Savepoint savepoint = con.setSavepoint();
            st.addBatch("insert into JDBC199 (name) values ('value three')");
            if (st.executeBatch().length == 5) {
                con.commit();
            } else {
//                con.rollback(savepoint);
//                con.releaseSavepoint(savepoint);
//                con.commit();
            }

        }
    }
}
