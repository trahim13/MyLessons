package Shild;


import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        new ThreadLock(reentrantLock, "ОДИН");
        new ThreadLock(reentrantLock, "ДВА");
        new ThreadLock(reentrantLock, "ТРИ");

    }



}

class Shared {
    static int count = 0;
}

class ThreadLock implements Runnable{
    ReentrantLock rl;


    ThreadLock(ReentrantLock rl, String name) {
        this.rl = rl;
        new Thread(this, name).start();

    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " пытается получить блокировку");
        rl.lock();
        System.out.println("Thered " + Thread.currentThread().getName() + " получил блокировку");
        Shared.count++;
        System.out.println("Thread  " + Thread.currentThread().getName() + " установил значение сount на " + Shared.count);
        System.out.println("Thread " + Thread.currentThread().getName() + " ожидает");
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " снимает блокировку");
        rl.unlock();

    }
}
