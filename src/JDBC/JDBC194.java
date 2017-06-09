package JDBC;


import java.sql.*;

public class JDBC194 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String USER = "root";
        final String PASSWORD = "root";
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {

            st.execute("drop table if exists JDBC194");
            st.executeUpdate("create table if not exists JDBC194(id mediumint auto_increment not null, name CHAR(30) not null, primary key(id)) ");
            st.executeUpdate("insert into JDBC194 (name) values ('first value in table')");
            st.executeUpdate("insert into JDBC194 (name) values ('second value in table')");
            st.executeUpdate("insert into JDBC194 (name) values ('three value in table')");

            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("select * from JDBC194");
            if (resultSet.absolute(1)) System.out.println(resultSet.getString(2));
            if(resultSet.next()) System.out.println(resultSet.getString(2));
            if(resultSet.relative(-1)) System.out.println(resultSet.getString(2));

        }
    }
}
