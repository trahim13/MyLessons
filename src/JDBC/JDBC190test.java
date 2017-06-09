package JDBC;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.sql.*;


public class JDBC190test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        final String USER = "root";
        final String PASSWODR = "root";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWODR);
             Statement st = con.createStatement()) {

            st.execute("drop table if exists  breindata");
            st.executeUpdate("create table if not exists breindata(id mediumint auto_increment not null, name char(30) not null, img blob, primary key(id))");

            BufferedImage image = ImageIO.read(new URL("http://ichef.bbci.co.uk/news/ws/660/amz/worldservice/live/assets/images/2015/12/08/151208124928_trump_624x351_reuters_nocredit.jpg"));
            Blob blob = con.createBlob();
            OutputStream outputStream = blob.setBinaryStream(1);
            ImageIO.write(image, "jpg", outputStream);

            PreparedStatement ps = con.prepareStatement("insert into breindata (name, img) values(?,?)");
            ps.setString(1, "Danald Tramp");
            ps.setBlob(2, blob);
            ps.execute();

            ResultSet resultSet = st.executeQuery("SELECT * FROM mydbtest.breindata");

            while (resultSet.next()) {

                BufferedImage image2 = ImageIO.read(resultSet.getBlob("img").getBinaryStream());
                resultSet.close();
                File f = new File("imageBLOG.jpg");
                ImageIO.write(image2, "jpg", f);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
