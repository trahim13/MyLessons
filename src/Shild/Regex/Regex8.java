package Shild.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Jon.*?[, ] ");
        Matcher matcher = pattern.matcher("Jon, Jonathan , Frank, Todd");

        String replaced = matcher.replaceAll("Eric, ");
        System.out.println(replaced);
    }
}
