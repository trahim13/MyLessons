package Shild.StreamAPI;


import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream6 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(14.5);
        list.add(15.1);
        list.add(16.5);
        list.add(-11.6);

        list.stream().forEach(a -> System.out.println(a));

        IntStream stremINt = list.stream().mapToInt(a -> (int) Math.ceil(a));
        stremINt.forEach(a-> System.out.print(a+" "));
    }
}
