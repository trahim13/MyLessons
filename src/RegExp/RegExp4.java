package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d\\d[ . - /\\\\]\\d\\d[\\\\]\\d\\d");
        Matcher mather = pattern.matcher("02\\03\\17");
        while (mather.find()) {
            System.out.println(mather.group());


        }
        Pattern pattern1 = Pattern.compile("\".*\"");
        Matcher matcher = pattern1.matcher("Put a \"string\" between a double quotes");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());

        }

        Pattern p3 = Pattern.compile("\".*?\"");//?
        Matcher m3 = p3.matcher("Houston, we have a problem with \"string one\" and \"string two\". Please, respond");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group());
        }

        Pattern p4 = Pattern.compile("\"[^\"\r\n*]\"");
        Matcher m4 = p4.matcher("Houston, we have a problem with \"string one\" and \"string two\". Please, respond");
        while (m4.find()) {
            System.out.println(m4.start() + " " + m4.group());
        }

    }
}
