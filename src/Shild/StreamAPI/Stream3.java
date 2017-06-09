package Shild.StreamAPI;


import java.util.ArrayList;

public class Stream3 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.0);
        arrayList.add(10.0);
        arrayList.add(12.0);
        arrayList.add(21.0);
        arrayList.add(111.0);
        arrayList.add(31.0);

        double productOfSqrtRoots = arrayList.parallelStream().unordered().reduce(
                1.0, (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b
        );

        System.out.println(productOfSqrtRoots);

        double productOfSqrtRoots2 = arrayList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b));
        System.out.println(productOfSqrtRoots2);

        double productOfSqrtRoots3 = arrayList.stream().reduce(1.0, (a, b) -> a * Math.sqrt(b));
        System.out.println(productOfSqrtRoots3);

        double productOfSqrtRoots4 = arrayList.parallelStream().sequential().reduce(1.0, (a, b) -> a * Math.sqrt(b));
        System.out.println(productOfSqrtRoots4);


    }
}
