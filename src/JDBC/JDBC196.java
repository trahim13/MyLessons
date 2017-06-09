package JDBC;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class JDBC196 {
    final static String USER = "root";
    final static String PASSWORD = "root";
    final static String URL = "jdbc:mysql://localhost:3306/mydbtest";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = getData();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
        }

            CachedRowSet cachedRowSet = (CachedRowSet) resultSet;
            cachedRowSet.setCommand("select * from JDBC196 where id=?");
            cachedRowSet.setInt(1, 1);

//            cachedRowSet.setUrl(URL);
//            cachedRowSet.setUsername(USER);
//            cachedRowSet.setPassword(PASSWORD);
//
//            cachedRowSet.setPageSize(10);
//            cachedRowSet.execute();
//
//            do {
//                while (cachedRowSet.next()) {
//                    System.out.println(resultSet.getInt(1));
//                    System.out.println(resultSet.getString(2));
//                }
//            } while (cachedRowSet.nextPage());

        CachedRowSet cachedRowSet1 = (CachedRowSet) resultSet;
        cachedRowSet1.setTableName("JDBC196");
        cachedRowSet1.setCommand("select * from JDBC196");
        cachedRowSet1.absolute(1);
        cachedRowSet1.deleteRow();

        cachedRowSet1.beforeFirst();
        while (cachedRowSet1.next()) {
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
        }
//        cachedRowSet1.acceptChanges(DriverManager.getConnection(URL, USER, PASSWORD));
    }

    static ResultSet getData() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement()) {

            st.execute("drop table if exists JDBC196");
            st.executeUpdate("create table if not exists JDBC196(id mediumint not null auto_increment, name CHAR(30) not null, primary key(id))");
            st.executeUpdate("insert into JDBC196 (name) values ('one')");
            st.executeUpdate("insert into JDBC196 (name) values ('two')");
            st.executeUpdate("insert into JDBC196 (name) values ('three')");

            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet cachedRowSet = factory.createCachedRowSet();

            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("select * from JDBC196");
            cachedRowSet.populate(resultSet);



            return cachedRowSet;
        }
    }
}
