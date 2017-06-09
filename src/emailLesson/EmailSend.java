package emailLesson;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class EmailSend {
    public static void main(String[] args) throws IOException, MessagingException {
        Properties properties = new Properties();
//        FileInputStream in = new FileInputStream("email.properties");
//        properties.load(in);

        properties.load(EmailSend.class.getClassLoader().getResourceAsStream("email.properties"));

        Session mailSession = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(mailSession);
        message.setFrom(new InternetAddress("trachimovich@gmail.com"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("pokemongotrahim@gmail.com"));
        message.setSubject("My first ");
        message.setText("Hellow! My dear friend its very impotant fo me to lern java languges");

        Transport tr = mailSession.getTransport();
        tr.connect("trachimovich@gmail.com", "13259092asd");
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();


    }
}
