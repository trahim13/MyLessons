package THREAD;


import java.util.concurrent.atomic.AtomicInteger;

public class Thread71 {
    static AtomicInteger atomicInteger = new AtomicInteger(0);
//    static int i;

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j <10_000 ; j++) {
            new MyAtomicThread().start();

        }
        Thread.sleep(1000);
        System.out.println(atomicInteger);
//        System.out.println(i);


    }

    static class MyAtomicThread extends Thread {
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
//            i++;
        }
    }

}
