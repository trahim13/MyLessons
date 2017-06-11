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
        System.out.println();

        Pattern p2 = Pattern.compile("Nov(ember)?");
        Matcher m2 = p2.matcher("November Nov");
        while (m2.find()) {
            System.out.print(m2.start()+" "+m2.group()+" ");
        }
        System.out.println();

        Pattern p3 = Pattern.compile("Feb(ruary)? 23(rd)?");
        Matcher m3 = p3.matcher("February 23rd, February 23, Feb 23rd, Feb 23 ");
        while (m3.find()) {
            System.out.print(m3.group() + " ");
        }
    }
}
