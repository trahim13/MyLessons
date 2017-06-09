package Shild.StreamAPI;


import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Stream9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");

        Stream<String> stream = arrayList.stream();
        Spliterator<String> spliterator = stream.spliterator();

        while (spliterator.tryAdvance(n -> System.out.print(n + " ")));
        System.out.println();

        Stream<String> stream2 = arrayList.stream();
        Spliterator<String> spliterator2 = stream2.spliterator();
        spliterator2.forEachRemaining(n-> System.out.print(n+"for"+" "));

    }
}
