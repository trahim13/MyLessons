package Shild.Regex;

public class Regex11 {
    public static void main(String[] args) {
        boolean matchString = "Java99999".matches("Java9+");
        if (matchString) {
            System.out.println("find.");
        }
    }
}
