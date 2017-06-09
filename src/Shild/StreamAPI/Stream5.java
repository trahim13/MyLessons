package Shild.StreamAPI;


import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream5 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> list = new ArrayList<>();
        list.add(new NamePhoneEmail("Ларри", "55555", "wwww"));
        list.add(new NamePhoneEmail("Greg", "44444", "qqqq"));
        list.add(new NamePhoneEmail("Pitter", "33333", "dddd"));
        list.add(new NamePhoneEmail("Nasty", "11111", "vvvv"));

        list.stream().forEach(a -> System.out.println(a.name + " " + a.phone + " " + a.email));

        Stream<NamePhone> stream2 = list.stream().map(a -> new NamePhone(a.name, a.phone));
        stream2.forEach(a-> System.out.println(a.name+ " "+ a.phone) );

    }
}

class NamePhoneEmail {
    String name;
    String phone;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phone = p;
        email = e;
    }
}

class NamePhone {
    String name;
    String phone;

    NamePhone(String n, String phone) {
        name = n;
        this.phone = phone;

    }
}
