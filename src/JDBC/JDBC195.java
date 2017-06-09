package JDBC;


import java.sql.*;

public class JDBC195 {
    public static void main(String[] args) throws ClassNotFoundException {
        final String USER = "root";
        final String PASSWORD = "root";
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {

            st.execute("drop table if exists JDBC195");
            st.executeUpdate("create table if not exists JDBC195(id mediumint auto_increment not null, name CHAR(30) not null, primary key(id))");
            st.executeUpdate("insert into JDBC195 (name) values ('same first value')");
            st.executeUpdate("insert into JDBC195 (name) values ('second value')");
            st.executeUpdate("insert into JDBC195 (name) values ('last value of the table')");

            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("select * from JDBC195");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));

            }
            System.out.println("-----------------------");

            resultSet.first();
            resultSet.updateString("name", "first updateble object");
            resultSet.updateRow();

            resultSet.moveToInsertRow();
            resultSet.updateString("name", "after last value");
            resultSet.insertRow();

            resultSet.absolute(3);
            resultSet.deleteRow();

            resultSet.beforeFirst();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
            }










        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
