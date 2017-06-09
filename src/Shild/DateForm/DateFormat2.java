package Shild.DateForm;


import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat2 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat;

        dateFormat = DateFormat.getTimeInstance();
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CANADA);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CANADA);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CANADA);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CANADA);
        System.out.println(dateFormat.format(date));
    }
}
