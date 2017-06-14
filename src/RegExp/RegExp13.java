package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp13 {
    public static void main(String[] args) {
//        Pattern p1 = Pattern.compile("a", Pattern.CASE_INSENSITIVE);
//        Pattern p1 = Pattern.compile("a$", Pattern.MULTILINE);

        Pattern p1 = Pattern.compile("a#this is a comment", Pattern.COMMENTS);



//        Matcher m1 = p1.matcher("a\na");
        Matcher m1 = p1.matcher("a#this is a comment");
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
        }

        System.out.println("a".matches("(?i)A"));
        System.out.println("a".matches("(?x)a#comment"));
        System.out.println("a".matches("(?ix)A#same comment and case insensitive"));
        System.out.println("AA".matches("(?i)a(?-i)a"));
        System.out.println("AAA".matches("(?i)a(?-i:A)a"));
    }
}
