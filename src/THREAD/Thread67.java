package THREAD;


public class Thread67 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
//        Thread.yield();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        myThread1.join();

        System.out.println("main method");

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread");

    }
}