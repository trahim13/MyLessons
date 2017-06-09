package THREAD;



public class Thread70 {
    static  int i;
    public static void main(String[] args) {
        new MyThreadWright().start();
        new MyThreadRead().start();

    }
    static class MyThreadWright extends Thread {
        @Override
        public void run() {
            while (i<5) {
                System.out.println("increment i = " + (++i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            int value = i;
            System.out.println(value);
            while (value < 5) {
                if (value != i) {
                    System.out.println("           new value i = " + value);
                    value = i;
                }

            }

        }
    }

}



