package JDBC;


import java.sql.*;

public class JDBC193 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        final String USER = "root";
        final String PASSWORD = "root";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {
            st.execute("drop table if exists JDBC193");
            st.executeUpdate("create table if not exists JDBC193 (id mediumint auto_increment not null, name CHAR(30) not null, primary key (id))");
            st.executeUpdate("insert into JDBC193 (name) values ('first value')");
            st.executeUpdate("insert into JDBC193 (name) values ('second value')");

            CallableStatement callableStatement = con.prepareCall("{call getCount}");
            boolean hasResultSet = callableStatement.execute();

            while (hasResultSet) {
                ResultSet resultSet = callableStatement.getResultSet();
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1));

                }
                hasResultSet = callableStatement.getMoreResults();
            }
        }
    }
}
