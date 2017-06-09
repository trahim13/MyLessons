package Shild.Regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        Pattern pet;
        Matcher matcher;
        boolean found;

        pet = Pattern.compile("Java");
        matcher = pet.matcher("Java");

        found = matcher.matches();
        System.out.println("Поверка на совпадение \" Java\" c \"Java\"");
        if (found) {
            System.out.println("Совпадение найдено");
        } else System.out.println("Совпадение не найдено");

        System.out.println();

        System.out.println("Проверка на совпадение \"Java\" с \"Java 8\"");
        matcher = pet.matcher("Java 8");
        found = matcher.matches();
        if (found) {
            System.out.println("Найдено");

        } else System.out.println("Совпадение с\"Java\" не найдено ");
    }
}
