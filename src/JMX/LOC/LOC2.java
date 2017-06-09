package JMX.LOC;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class LOC2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("resource");
//        ResourceBundle resourceDe = ResourceBundle.getBundle("resource", new Locale("de", "GR"));
//        ResourceBundle resourceEn = ResourceBundle.getBundle("resource", new Locale("en", "US"));
//        ResourceBundle resourceFR = ResourceBundle.getBundle("resource", new Locale("fr"));
//
////        System.out.println(new String(resourceBundle.getString("samevalue").getBytes("ISO-8859-1"), "UTF-8"));
//        System.out.println(resourceDe.getString("samevalue"));
//        System.out.println(resourceEn.getString("samevalue"));
//        System.out.println(resourceFR.getString("samevalue"));

        ResourceBundle resourceDefault = ResourceBundle.getBundle("resources.resource");
        System.out.println(resourceDefault.getString("sameValue"));

        ResourceBundle resourceRU = ResourceBundle.getBundle("resources.resource", new Locale("en", "US"));
        System.out.println(resourceRU.getString("samevalue"));

        ResourceBundle resourceFR = ResourceBundle.getBundle("resources.resource", new Locale("fr"));
        System.out.println(resourceFR.getString("samevalue"));

    }
}
