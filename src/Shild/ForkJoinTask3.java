package Shild;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTask3 {
    public static void main(String[] args) {
        ForkJoinPool poll = ForkJoinPool.commonPool();
        double data[] = new double[5_000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (double) (((i % 2) == 0) ? i : -i);
        }

        Sum2 task = new Sum2(data, 0, data.length);
        double summation = poll.invoke(task);
        System.out.println(summation);
    }
}

class Sum2 extends RecursiveTask<Double> {
    final int seqThresHold = 500;
    double data[];
    int start, end;

public Sum2(double d[], int s, int e) {
    data = d;
    start = s;
    end = e;


}

    @Override
    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqThresHold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            int middle = (start + end) / 2;
            Sum2 subTask = new Sum2(data, start, middle);
            Sum2 subTask2 = new Sum2(data, middle, end);

            subTask.fork();
            subTask2.fork();

            sum = subTask.join() + subTask2.join();
        }
        return sum;
    }
}

