package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp11 {
    public static void main(String[] args) {
        System.out.println("abc".replaceAll("(?<Aletter>a)", "${Aletter}-"));

        Pattern p1 = Pattern.compile("<(?<tag>[A-Z][A-Z0-9]*)*>.*?</\\k<tag>>");
        Matcher m1 = p1.matcher("This is a <EM>firstt</EM>test");
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
        }

        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)", "$1-$2-$3-$4"));
        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)", "$1 ${x} $3 ${y}"));
    }
}
