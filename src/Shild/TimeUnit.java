package Shild;

import java.util.concurrent.*;

public class TimeUnit {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;
        System.out.println("Запуск");

        f = executor.submit(new Sum1(5));
        f2 = executor.submit(new Hupot1(3, 6));
        f3 = executor.submit(new Factorial1(5));

        try {
            System.out.println(f.get(10, java.util.concurrent.TimeUnit.NANOSECONDS));
            System.out.println(f2.get(1, java.util.concurrent.TimeUnit.NANOSECONDS));
            System.out.println(f3.get(5, java.util.concurrent.TimeUnit.SECONDS));
        } catch (Exception e) {
            System.out.println(e);
        }

        executor.shutdown();
        System.out.println("Завершение");

    }


}

class Sum1 implements Callable<Integer> {
    int stop;

    Sum1(int v) {
        stop = v;
    }


    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }

}

class Hupot1 implements Callable<Double> {
    double side1, side2;
    Hupot1(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class Factorial1 implements Callable<Integer> {
    int stop;

    Factorial1(int v) {
        stop = v;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }


}
