package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp5 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\bis\\b");
        Matcher m1 = p1.matcher("This island is baautiful");
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());

        }
    }
}
