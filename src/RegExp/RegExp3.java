package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp3 {
    public static void main(String[] args) {
        System.out.println("acc".matches("[a-z]*"));
        Pattern pattern = Pattern.compile("[a-b0-3A-Z*%$#]");
        Matcher matcher = pattern.matcher("abc125Az#$!*-");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+ " ");

        }

        Pattern pattern1 = Pattern.compile("gr[ae]y");
        Matcher matcher1 = pattern1.matcher("grey");
        while (matcher1.find()) {
            System.out.println();
            System.out.println(matcher1.start()+ " " + matcher1.group());
        }

        Pattern pattern2 = Pattern.compile("[1+2=1]");
        Matcher matcher2 = pattern2.matcher("1+1=2");
        while (matcher2.find()) {
            System.out.print( matcher2.start() +" " +matcher2.group() + " ");

        }

        Pattern pattern3 = Pattern.compile("q[^u]");
        Matcher matcher3 = pattern3.matcher("Iraq is a country.");//Iraqu

        while (matcher3.find()) {
            System.out.println();
            System.out.println(matcher3.start() + " " + matcher3.group()+" "+ matcher3.end());

        }

        Pattern pattern4 = Pattern.compile("[^a]");
        Matcher matcher4 = pattern4.matcher("aq^");
        while (matcher4.find()) {
            System.out.println(matcher4.start() + " " + matcher4.group());

        }

        Pattern pattern5 = Pattern.compile("[\\Q[a-z]\\E]");
        Matcher matcher5 = pattern5.matcher("asdz[]");
        while (matcher5.find()) {
            System.out.print(matcher5.start() + " " + matcher5.group() + " ");

        }
        System.out.println();


        Pattern pattern6 = Pattern.compile("\\w+");// \\d \\s \\[\\s\\d] \\s\\d
        Matcher matcher6 = pattern6.matcher("                 12as d5_\n");
        while (matcher6.find()) {
            System.out.print(matcher6.start() + " - " + matcher6.group() + "    ");
        }
        System.out.println();
    }
}
