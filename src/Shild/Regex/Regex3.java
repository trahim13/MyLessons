package Shild.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher("Java o nothing. Only Java: Java 8, Java 9");
        int count = 0;

        while( matcher.find()) {
            System.out.println("Найдено по индексу: " + "start - " + matcher.start()+ " end - " + matcher.end());
            count++;

        }
        System.out.println("Всего найдено савпадений: " + count);
    }
}
