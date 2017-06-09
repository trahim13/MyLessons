package JMX;



import java.text.MessageFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class JMX5 {
    public static void main(String[] args) {
        String s = "On 19/04/2017 was cold";
        String s2 = "On 18/04/2017 was sunni day";
        String s3 = "On {0} was {1}";
        String s4 = MessageFormat.format(s3, "20.04.2017", "not good day for work");
        System.out.println(s4);

        String s5 = "On {0} was {1}, destroy {2, number}";

        System.out.println(MessageFormat.format(s5, "monday", "cold", 10));

        String s6 = "On {0, date, long} was {1} and {2,number, currency} was destroy";
        String s7 = MessageFormat.format(s6, new Date(), "sunni", 132);
        System.out.println(s7);

        String s8 = "On {0} was {1} and {2,choice,0#no hause|1#one houses|2#{2}|13#vot sap} hauses";
        String s9 = MessageFormat.format(s8, "jjj", "cold", 13);
        System.out.println(s9);
    }
}
