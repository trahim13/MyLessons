package JDBC;

import java.sql.*;

public class JDBC192 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String USER = "root";
        final String PASSWORD = "root";
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {
            st.execute("drop table if exists JDBC192");
            st.executeUpdate("create table if not exists JDBC192(id mediumint auto_increment not null, name CHAR(30) not null, primary key(id))");
            st.executeUpdate("insert into JDBC192 (name) values ('name1')");
            st.executeUpdate("insert into JDBC192 (name) values ('name2')");

            CallableStatement callableStatement = con.prepareCall("{call NameCount(?)}");
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute();
            System.out.println(callableStatement.getInt(1));
            System.out.println("-------------");

            CallableStatement callableStatement1 = con.prepareCall("{call getName(?)}");
            callableStatement1.setInt(1, 1);
            if (callableStatement1.execute()) {
                ResultSet resultSet = callableStatement1.getResultSet();
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id"));
                    System.out.println(resultSet.getString("name"));

                }
            }
        }

    }
}
