package Shild.StreamAPI;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail1> al = new ArrayList<>();
        al.add(new NamePhoneEmail1("Larry", "1111", "eadress"));
        al.add(new NamePhoneEmail1("Petty", "222", "edostavka"));
        al.add(new NamePhoneEmail1("Kristy", "333", "ekristy"));
        al.add(new NamePhoneEmail1("Andry", "44444", "eandry"));
        al.add(new NamePhoneEmail1("Garry", "5555", "epotter"));

        al.forEach(a -> System.out.println(a.name + " " + a.phone + " " + a.email));
        Stream<NamePhone1> newStream = al.stream().map(a -> new NamePhone1(a.name, a.email));
        List<NamePhone1> listNameAndPhone = newStream.collect(Collectors.toList());
//        newStream.forEach(a -> System.out.println(a.name + " " + a.phone));

        for (NamePhone1 a:
             listNameAndPhone) {
            System.out.println(a.name+" "+a.phone);

        }
        newStream = al.stream().map(a -> new NamePhone1(a.name, a.email));
        LinkedList<NamePhone1> ll = newStream.collect(
                () -> new LinkedList<NamePhone1>(),
                (list, element) -> list.add(element),
                (list1, list2) ->list1.addAll(list2)
        );

        for (NamePhone1 a :
                ll) {
            System.out.print(a.name+ " " + a.phone+ " / ");
        }

        newStream = al.stream().map(a -> new NamePhone1(a.name, a.email));
        HashSet<NamePhone1> hs = newStream.collect(
                HashSet::new,
                HashSet::add,
                HashSet::addAll
        );
        System.out.println();

        for (NamePhone1 a :
                hs) {
            System.out.println(a.name+ " : " + a.phone+ ", ");

        }
    }

}

class NamePhoneEmail1 {
    String name;
    String phone;
    String email;

    NamePhoneEmail1(String n, String p, String email) {
        name = n;
        phone = p;
        this.email = email;
    }
}

class NamePhone1 {
    String name;
    String phone;

    NamePhone1(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}