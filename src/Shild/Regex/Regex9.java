package Shild.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex9 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[ ,!9]+");


        String[] strs = pattern.split("one two, three,four  five 12!done9, end");
        for (String a :
                strs) {
            System.out.println(a);
        }
    }
}
