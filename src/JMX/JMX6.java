package JMX;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class JMX6 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
//        System.out.println(locale);
        Locale locale2 = Locale.getDefault();
//        System.out.println(locale2);
        Locale locale3 = Locale.GERMANY;
//        System.out.println(locale3);

//        Locale[] locales = Locale.getAvailableLocales();
//        for (Locale l :
//                locales) {
//            System.out.println(l);
//        }

        System.out.println(Locale.getDefault());

        System.out.println(NumberFormat.getCurrencyInstance(locale).format(100));
        System.out.println(NumberFormat.getCurrencyInstance(locale2).format(100));
        System.out.println(NumberFormat.getCurrencyInstance(locale3).format(100));
        System.out.println(NumberFormat.getCurrencyInstance().format(100));

        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale).format(new Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale2).format(new Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale3).format(new Date()));


    }


}
