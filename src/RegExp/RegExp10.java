package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp10 {
    public static void main(String[] args) {
//        Pattern p1 = Pattern.compile("Set(Value)?");
        Pattern p1 = Pattern.compile("Set(?:Value)?");
        Matcher m1 = p1.matcher("Set or SetValue");
        while (m1.find()) {
            System.out.print(m1.start() + " " + m1.group() + " ");
        }
        System.out.println();

        Pattern p2 = Pattern.compile("EditPad (Lite|Pro)");
        Matcher m2 = p2.matcher("EditPad Pro version");
        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
        System.out.println();

        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$1 version"));
        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$0 version"));
        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$1 version").toUpperCase());
        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$1 version").toLowerCase());

        Pattern p3 = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>");
        Matcher m3 = p3.matcher("This is a <EM>first</EM> test");
        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group());
        }

        Pattern p4 = Pattern.compile("([a-c])x\\1x\\1");
        Matcher m4 = p4.matcher("axaxa");
        while (m4.find()) {
            System.out.println(m4.group());

        }

        Pattern p5 = Pattern.compile("<([A-Z][A-Z0-9]*)>.*?</\\1>");
        Matcher m5 = p5.matcher("Testing <B><I>bold italic</I></B> text");
        while (m5.find()) {
            System.out.println(m5.start() + " " + m5.group());
        }

//        Pattern p6 = Pattern.compile("([abc]+)\\1");
        Pattern p6 = Pattern.compile("([abc])+\\1");

        Matcher m6 = p6.matcher("cabb");
        while (m6.find()) {
            System.out.println(m6.group());

        }

        System.out.println("the the".replaceAll("\\b(\\w+)\\b\\s\\1\\b", "$1"));


    }

}
