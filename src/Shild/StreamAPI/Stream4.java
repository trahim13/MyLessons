package Shild.StreamAPI;


import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.0);
        arrayList.add(10.0);
        arrayList.add(12.0);
        arrayList.add(21.0);
        arrayList.add(111.0);
        arrayList.add(31.0);

        Stream<Double> stream = arrayList.stream().map(a -> Math.sqrt(a));

        double result = stream.reduce(1.0, (a, b) -> a * b);
        System.out.println(result);

//        2944.7105120877327
    }
}
