package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp14_PossesiveQuantifier {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\"[^\"]*+\"");
        Matcher m1 = p1.matcher("\"abc\"");
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
        }

        Pattern p2 = Pattern.compile("\".*+\"");
        Matcher m2 = p2.matcher("\"abc\"x");
        while (m2.find()) {
            System.out.println("p2 "+m2.start() + " " + m2.group());
        }

//        Pattern p3 = Pattern.compile("(?:a|b)*+b");
//        Pattern p3 = Pattern.compile("(?>(?:a|b)*)b");
        Pattern p3 = Pattern.compile("(?>a|b)*b");

        Matcher m3 = p3.matcher("b");
        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group());
        }
    }
}
