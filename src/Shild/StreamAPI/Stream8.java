package Shild.StreamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class Stream8 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        al.add("five");

        Stream<String> stream = al.stream();
        Iterator<String> iterator = stream.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }
}
