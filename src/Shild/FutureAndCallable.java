package Shild;

import java.util.concurrent.*;

public class FutureAndCallable {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;
        System.out.println("Запуск");

        f = executor.submit(new Sum(5));
        f2 = executor.submit(new Hupot(3, 6));
        f3 = executor.submit(new Factorial(5));

        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (Exception e) {
            System.out.println(e);
        }

        executor.shutdown();
        System.out.println("Завершение");

    }


}

class Sum implements Callable<Integer> {
    int stop;

    Sum(int v) {
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

class Hupot implements Callable<Double> {
    double side1, side2;
    Hupot(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class Factorial implements Callable<Integer> {
    int stop;

    Factorial(int v) {
        stop = v;
    }
    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <=stop ; i++) {
            fact *= i;
        }
        return fact;
    }

}
