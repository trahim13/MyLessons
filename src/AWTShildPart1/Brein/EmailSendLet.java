package AWTShildPart1.Brein;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;


public class EmailSendLet {
    public static void main(String[] args) throws IOException, MessagingException {
        Properties p = new Properties();
        p.load(EmailSendLet.class.getClassLoader().getResourceAsStream("email1.properties"));

        Session emailSession = Session.getDefaultInstance(p);
        MimeMessage message = new MimeMessage(emailSession);
        message.setFrom(new InternetAddress("trachimovich@gmail.com"));
        message.setSubject("My second letter");
        message.setText("Thisis is my seond letters fo you");
        message.addRecipients(Message.RecipientType.TO, "pokemongotrahim@gmail.com");

        Transport t = emailSession.getTransport("smtps");
        t.connect("trachimovich@gmail.com", "13259092asd");
        t.sendMessage(message, message.getAllRecipients());
        t.close();
    }
}
