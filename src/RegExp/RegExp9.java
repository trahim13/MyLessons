package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp9 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("<[a-zA-Z][A-Za-z0-9]*"); // \\w
//        Matcher m1 = p1.matcher("<a>");
        Matcher m1 = p1.matcher("<p1 fdf ef >");
        while (m1.find()) {
            System.out.println(m1.group());

            Pattern p2 = Pattern.compile("\\b[1-9,][0-9]{2,4}\\b");
            Matcher m2 = p2.matcher("100, 99999 222");
            while (m2.find()) {
                System.out.print(m2.start()+ " " +m2.group()+ " ");
            }
            System.out.println();

        }

//        Pattern p3 = Pattern.compile("<.+>");
//        Pattern p3 = Pattern.compile("<.+?>");
        Pattern p3 = Pattern.compile("<[^>]+>");
        Matcher m3 = p3.matcher("This is a <EM>first</EM> test");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");

        }
        System.out.println();

//        Pattern p4 = Pattern.compile("\\Q*\\d+*\\E");
        Pattern p4 = Pattern.compile("(\\Q*\\d+*\\E)+");
//        Pattern p4 = Pattern.compile("(?:\\Q*\\d+*\\E)+");
        Matcher m4 = p4.matcher("*\\d+**\\d+*");
        while (m4.find()) {
            System.out.println(m4.start() + " " + m4.group());

        }
    }
}
