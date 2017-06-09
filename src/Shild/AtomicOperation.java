package Shild;


import java.util.concurrent.atomic.AtomicInteger;

public class AtomicOperation {
    public static void main(String[] args) {
        new AtomThread("ONE");
        new AtomThread("TWO");
        new AtomThread("Three");
    }
}

class AtomSharead {
   static AtomicInteger ai = new AtomicInteger(0);

}

class AtomThread implements Runnable {
    public AtomThread(String name) {
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + Thread.currentThread().getName());
        for (int i = 0; i < 4; i++) {
            System.out.println("Получено " + AtomSharead.ai.getAndSet(i) + " " + Thread.currentThread().getName());

        }
    }


}
