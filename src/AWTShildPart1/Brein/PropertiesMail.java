package AWTShildPart1.Brein;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by petrovski on 22.03.2017.
 */
public class PropertiesMail {

    public static void main(String[] args) throws IOException{
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtps");
        properties.setProperty("mail.smtps.auth", "true");
        properties.setProperty("mail.smtps.host", "smtp.gmail.com");
        properties.setProperty("mail.smtps.user", "trachimovich@gmail.com");

        FileOutputStream out = new FileOutputStream("email1.properties");
        properties.store(out, "my properties fo email sed letters");
    }

}
//mail.smtps.auth=true
//        mail.smtps.host=smtp.gmail.com
//        mail.smtps.user=trachimovich@gmai.com