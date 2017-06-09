package Shild.DateForm;

import java.text.DateFormat;
import java.util.Date;

public class DateFormat3 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;

        df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        System.out.println(df.format(date));

        df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL);
        System.out.println(df.format(date));
    }
}
