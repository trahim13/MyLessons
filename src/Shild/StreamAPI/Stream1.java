package Shild.StreamAPI;


import java.util.*;
import java.util.stream.BaseStream;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(8);
        myList.add(11);
        myList.add(-5);
        myList.add(86);
        myList.add(18);
        myList.add(3);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> myMin = myStream.min(Integer::compare);
        if (myMin.isPresent()) {
            System.out.println(myMin.get());

        }


        myStream = myList.stream();
        Optional<Integer> myMax = myStream.max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
            }
        });
        if (myMax.isPresent()) {
            System.out.println(myMax.get());
//
        }

        Stream<Integer> mySortedStream = myList.stream().sorted();
        System.out.print("Отсортированный поток данных: ");

        mySortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n % 2) !=0);
        System.out.print("Нечетные значения: ");
        oddVals.forEach(n -> System.out.print(n+" "));
        System.out.println();

        oddVals = myList.stream().filter(n -> (n % 2) != 0)
                .filter(n -> n > 5);
        System.out.println("Нечетные значения больше 5: ");
        oddVals.forEach(n -> System.out.println(n + " "));
    }
}
