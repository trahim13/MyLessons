package Shild.StreamAPI;


import java.util.ArrayList;
import java.util.Optional;

public class Stream2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(41);
        list.add(16);
        list.add(11);
        list.add(111);
        list.add(3);

        Optional<Integer> first = list.stream().reduce((a, b) -> a * b);

        if (first.isPresent()) {
            System.out.println(first.get());
        }

        int second = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(second);

        int product = list.stream().reduce(1, (a, b) -> {
            if (b % 2 == 0) return a * b;
            else return a;

        });

        System.out.println(product);
    }
}
