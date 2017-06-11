package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp7 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("cat|dog.*?\\b");
        Matcher m1 = p1.matcher("I like my dogfried and cat");

        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
        }

//        Pattern p2 = Pattern.compile("Get|Set|SetValue|GetValue");
//        Pattern p2 = Pattern.compile("Get|SetValue|GetValue|Set");
//        Pattern p2 = Pattern.compile("Get(Value)|Set(Value)");
//        Pattern p2 = Pattern.compile("\\bGet(Value)?|Set(Value)?\\b");
        Pattern p2 = Pattern.compile("\\b(Set|Get)(Value)?\\b");

        Matcher m2 = p2.matcher("SetValue ");
        while (m2.find()) {
            System.out.println(m2.start() + " " +m2.group());
        }
    }
}
