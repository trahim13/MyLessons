package Shild;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinTask1 {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        double nums[] = new double[10_000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }

        SqrtTransform sq = new SqrtTransform(nums, 0, nums.length);
//        forkJoinPool.invoke(sq);
        sq.invoke();

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ", nums[i]);
        }
    }
}

class SqrtTransform extends RecursiveAction {
    final int porogvalue = 1_000;

    double data[];
    int start;
    int end;

    SqrtTransform(double valse[], int start, int end) {
        data = valse;
        this.start = start;
        this.end= end;

    }

    @Override
    protected void compute() {
        if ((end - start) < porogvalue) {
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            int middle = (start+end) / 2;
           invokeAll(new SqrtTransform(data, start, middle),
            new SqrtTransform(data, middle, end));

        }


    }
}
