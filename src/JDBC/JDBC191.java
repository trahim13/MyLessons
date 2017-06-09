package JDBC;


import java.sql.*;
import java.util.Calendar;

public class JDBC191 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        final String USER = "root";
        final String PASSWOR = "root";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWOR);
             Statement st = con.createStatement()) {
            st.execute("drop table if exists JDBC191");
            st.executeUpdate("create table if not exists JDBC191(id mediumint auto_increment not null, name char(30) not null, dt date, primary key(id))");

            PreparedStatement ps = con.prepareStatement("insert into JDBC191 (name, dt) values ('name', ?)");
            ps.setDate(1, new Date(System.currentTimeMillis()));              //1490735259655L
            ps.execute();
            System.out.println(ps);

//            st.executeUpdate("insert into jdbc191 (name, dt) values ('same name', {d'2018-3-29'})");

            ResultSet rs = st.executeQuery("select * from jdbc191");
            while (rs.next()) System.out.println(rs.getDate("dt"));

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
