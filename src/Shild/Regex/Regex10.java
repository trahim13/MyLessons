package Shild.Regex;

import java.util.regex.Pattern;

public class Regex10 {
    public static void main(String[] args) {
        boolean matc = Pattern.matches("Java.*", "Java 9");
        if (matc) {
            System.out.println("FIND.");
        }
    }
}
