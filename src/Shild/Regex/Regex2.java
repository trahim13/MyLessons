package Shild.Regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher("Java 8");
        if (matcher.find()) {
            System.out.println("Совпадение найдено");

        }else System.out.println("Совпадение не найдено");
    }
}
