package Shild.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex7 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z ]+");
        Matcher matcher = pattern.matcher("This1is2same4text5for8            find111");

        while (matcher.find()) {
            System.out.println("Найдено : " + matcher.group());
        }
    }
}
