package Shild.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w+");
        Matcher matcher = pattern.matcher("ww w www www");

        int foundCount = 0;

        while (matcher.find()) {
            System.out.println("Найдено совпадение : " + matcher.group());
            foundCount++;

        }
        System.out.println("Find compile number = " + foundCount);

        foundCount = 0;

         pattern = Pattern.compile("J+a+v+a+");
         matcher = pattern.matcher("Java JJJJJJaaavaaaааaaaaa");



        while (matcher.find()) {
            System.out.println("Найдено совпадение : " + matcher.group());
            foundCount++;

        }
        System.out.println("Find compile number = " + foundCount);


    }
}
