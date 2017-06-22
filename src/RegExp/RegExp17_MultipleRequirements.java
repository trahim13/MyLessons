package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp17_MultipleRequirements {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("(?=\\b\\w{6}\\b)\\b\\w{0,3}cat\\w*\\b");
        Matcher m1 = p1.matcher("wecate");
        while (m1.find()) {
            System.out.println(m1.start()+" "+m1.group());
        }

        Pattern p2 = Pattern.compile("\\b(?=\\w{6,12}\\b)\\w{0,9}(cat|dog|mouse)\\w*");
        Matcher m2 = p2.matcher("wedogee");
        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group());
        }
    }
}
