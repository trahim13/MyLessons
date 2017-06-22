package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp16_LookAround {
    public static void main(String[] args) {
        //lookahead
//        Pattern p1 = Pattern.compile("q(?=u)");
        Pattern p1 = Pattern.compile("q(?!u)");
        Matcher m1 = p1.matcher("Iraq"); //u
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
        }

        //lookbehind
//        Pattern p2 = Pattern.compile("(?<=a)b"); //cab
        Pattern p2 = Pattern.compile("(?<!a)b");
        Matcher m2 = p2.matcher("cb");
        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group());

        }
    }
}
