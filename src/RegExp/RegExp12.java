package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp12 {
    public static void main(String[] args) {
        System.out.println("\u0061\u0300");
        System.out.println("\u00E0");

//        Pattern p1 = Pattern.compile("\u00E0");
        Pattern p1 = Pattern.compile("\\x{00E0}");

//        Pattern p1 = Pattern.compile("\u0061");
//        Matcher m1 = p1.matcher("à");
        Matcher m1 = p1.matcher("à");
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
        }

//        unicode latter
//        Pattern p2 = Pattern.compile("\\p{L}");

        //ascii letter add symbol of any line
//        Pattern p2 = Pattern.compile("\\p{M}");

        //any space
//        Pattern p2 = Pattern.compile("\\p{Z}");

        //symbol dollar etc
//        Pattern p2 = Pattern.compile("\\p{S}");
//number
//        Pattern p2 = Pattern.compile("\\p{N}");

        //punctuation
//        Pattern p2 = Pattern.compile("\\p{P}");

        //other invisible character
//        Pattern p2 = Pattern.compile("\\p{C}");

        Pattern p2 = Pattern.compile("[\\p{L}\\p{P}]", Pattern.MULTILINE);






        Matcher m2 = p2.matcher("1, 3: d; $.. ^ x? à\n\n");
        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }

        System.out.println();

        Pattern p3 = Pattern.compile("\\b[\\p{Digit}]{1,5}\\b");
        Matcher m3 = p3.matcher("2366 ds");
        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group() + " ");
        }

        Pattern p4 = Pattern.compile("à", Pattern.CANON_EQ);
        Matcher m4 = p4.matcher("à");
        while (m4.find()) {
            System.out.println(m4.start() + " " + m4.group());
        }
    }
}
