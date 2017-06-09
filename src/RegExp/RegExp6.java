package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp6 {
    public static void main(String[] args) {
//        Pattern p1 = Pattern.compile("^a");
//        Pattern p1 = Pattern.compile("c$");
        Pattern p1 = Pattern.compile("\\b.*c$\\b");
        Matcher m1 = p1.matcher("abc");

        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());

        }

//        Pattern p2 = Pattern.compile("\\d");
        Pattern p2 = Pattern.compile("^\\d+$");//*  // ^ == \\A    $ ==\\Z
//        Matcher m2 = p2.matcher("asd34r");
        Matcher m2 = p2.matcher("3453");

        while (m2.find()) {
            System.out.println(" it a number: " + m2.group());

        }

        Pattern p3 = Pattern.compile("ne$", Pattern.MULTILINE);
        Matcher m3 = p3.matcher("first line\nsecond line");
        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group());
        }
        Pattern p4 = Pattern.compile("ne\\Z", Pattern.MULTILINE);
        Matcher m4 = p3.matcher("first line\nsecond line\n");
        while (m4.find()) {
            System.out.println(m4.start() + " " + m4.group());
        }
    }
}
