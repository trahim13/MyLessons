package Shild.StreamAPI;


import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Stream10 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        al.add("five");

        Stream<String> stream = al.stream();

        Spliterator<String> spliterator = stream.spliterator();

        Spliterator<String> spliterator2 = spliterator.trySplit();

        if (spliterator2 != null) {
            System.out.println("Data printable from spliterator2:");
            spliterator2.forEachRemaining(n -> System.out.print(n+" "));
            System.out.println();
            System.out.println();
        }

        System.out.println("Data printable from SPLITERATOR:");
        spliterator.forEachRemaining(n-> System.out.print(n+" "));
    }
}
