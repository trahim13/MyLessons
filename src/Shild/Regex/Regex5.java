package Shild.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("e.+d");
        Matcher matcher = pattern.matcher("extend cup end table ed");

        while(matcher.find()) System.out.println("Найдено : " + matcher.group());
    }
}
