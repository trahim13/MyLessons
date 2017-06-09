package Shild.DateForm;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat1 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;
        System.out.println(date);

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("JAPAN: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
        System.out.println("KOREA: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CANADA);
        System.out.println("CANADA: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
        System.out.println("UK: " + date);
    }
}
