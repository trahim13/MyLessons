package Shild;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class ForkJoinTask2 extends RecursiveAction {
    int seqThreshold;

    double data[];
    int start;
    int end;

    ForkJoinTask2(double data[], int start, int end, int seqThreshold) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.seqThreshold = seqThreshold;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0) {
                    data[i] = Math.sqrt(data[i]);
                } else
                    data[i] = Math.cbrt(data[i]);
            }
        } else {
            int middle = (start+end)/2;
            invokeAll(
                    new ForkJoinTask2(data, start, middle, seqThreshold),
                    new ForkJoinTask2(data, middle, end, seqThreshold)
            );

        }

    }
}

public class FJTStart {
    public static void main(String[] args) {
        double[] data = new double[100_000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(data[i] + " ");
        }

        ForkJoinTask2 forkJoinTask2 = new ForkJoinTask2(data, 0, data.length, 10000);
        long begin, finih;
        ForkJoinPool pool = new ForkJoinPool(1);
        begin = System.nanoTime();
        pool.invoke(forkJoinTask2);
        finih = System.nanoTime();

        System.out.println("Parallel level " + pool.getParallelism());
        System.out.println("Time " + (finih - begin));
        System.out.println();



    }
}


