package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("Jack is a boy");

        while (matcher.find()) {
            System.out.print(matcher.start() + matcher.group() + "\n");
        }

        Pattern pattern2 = Pattern.compile("cat");
        Matcher matcher2 = pattern2.matcher("About cats and dogs");
        while (matcher2.find()) {
            System.out.println(matcher2.start() + " " + matcher2.group());

        }

        Pattern pattern3 = Pattern.compile("1\\+2=3");
        Matcher matcher3 = pattern3.matcher("1+2=3");
        while (matcher3.find()) {
            System.out.println(matcher3.start() + " " + matcher3.group());
        }

        Pattern pattern4 = Pattern.compile("\\Q1+1=2\\E");
        Matcher matcher4 = pattern4.matcher(" 1+1=2");
        while (matcher4.find()) {
            System.out.println(matcher4.start() + " " + matcher4.group());
        }

        Pattern pattern5 = Pattern.compile("cat");
        Matcher matcher5 = pattern5.matcher("He captured a catfish for his cat");
        while (matcher5.find()) {
            System.out.print(matcher5.start() + " " + matcher5.group() + "\n");
        }





    }
}
