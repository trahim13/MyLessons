package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class JDBCtest {
    public static void main(String[] args) throws ClassNotFoundException {
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        final String USER = "root";
        final String PASSWORD = "root";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(URL,USER, PASSWORD);
             Statement s = connection.createStatement()) {
            System.out.println("OK");
            s.execute("drop table ide");
            s.executeUpdate("CREATE TABLE IF NOT EXISTS ide(id MEDIUMINT NOT NULL AUTO_INCREMENT, name CHAR(30) NOT NULL, password CHAR(30) NOT NULL, PRIMARY KEY (id))");
            s.executeUpdate("insert into ide (name, password) value('first user', '12345')");
            s.executeUpdate("insert into ide (name, password) value ('second user', '98765')");
            String userID = "1' or 1 = '1";
////
            ResultSet resultSet = s.executeQuery("select * from ide where id = '"+ userID+"'");
//
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from ide where id = ?");
//            preparedStatement.setString(1, userID);
//            ResultSet r2 = preparedStatement.executeQuery();
//            while (r2.next()) {
//                System.out.println(r2.getString(2));
//                System.out.println(r2.getString(3));
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
