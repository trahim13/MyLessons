package JDBC;


import java.sql.*;

public class JDBC197 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String USER = "root";
        final String PASSWORD = "root";
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {

            st.execute("drop table if exists JDBC197");
            st.executeUpdate("create table if not exists JDBC197(id mediumint auto_increment not null, name CHAR(30) not null, primary key(id))");
            st.executeUpdate("insert into JDBC197 (name) values ('first value')");
            st.executeUpdate("insert into JDBC197 (name) values ('second value')");

            DatabaseMetaData databaseMetaData = con.getMetaData();
            ResultSet resultSet = databaseMetaData.getTables(null, null, null, new String[]{"Table"});
            while (resultSet.next()) {
                System.out.println(resultSet.getString(3));

            }

            ResultSet resultSet1 = st.executeQuery("select * from JDBC197");
            ResultSetMetaData resultSetMetaData = resultSet1.getMetaData();
            for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                System.out.println(resultSetMetaData.getColumnLabel(i));
                System.out.println(resultSetMetaData.getColumnType(i));
            }   }
    }
}
