package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp8_OptionalItems {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("colou?r");
        Matcher m1 = p1.matcher("color colour");

        while (m1.find()) {
            System.out.print(m1.start() + " " + m1.group() + " ");
        }
    }
}
