package JDBC;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.sql.*;


public class JDBC190 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        final String URL1 = "jdbc:mysql://localhost:3306/mydbtest";
        final String USER = "root";
        final String PASSWORD = "root";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL1, USER, PASSWORD);
             Statement st = con.createStatement()) {

            st.execute("drop table if exists myblob");
            st.executeUpdate("create table if not exists myblob(id mediumint auto_increment not null, name char(30) not null, img blob, primary key(id))");
            URL url = new URL("http://rucco.ru/upload/clu/images/243a8c.gif");

            BufferedImage brI = ImageIO.read(url);
            Blob blob = con.createBlob();
            try (OutputStream outputStream = blob.setBinaryStream(1)) {
                ImageIO.write(brI, "GIF", outputStream);

            }

            PreparedStatement ps = con.prepareStatement("insert into myblob (name, img) values (?,?)");
            ps.setString(1,"man");
            ps.setBlob(2, blob);
            ps.execute();

            ResultSet resultSet = ps.executeQuery("select * from myblob");
            while (resultSet.next()) {
                Blob blob1 = resultSet.getBlob("img");
                BufferedImage bufferedImage = ImageIO.read(blob1.getBinaryStream());
                File f = new File("imageBLOG.jpg");
                ImageIO.write(bufferedImage, "jpg", f);
            }




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
