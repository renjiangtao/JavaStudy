package homework.day05;

import sun.misc.Lock;

public class unsafeThread {
    public static int i = 0;
    Lock lock = new Lock();
    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (this) {
                    for (int j = 0; j < 10000000; j++) {
                        i++;
                    }
                    System.out.println("线程1结束");
                }
            }
        };

        thread1.setDaemon(true);   //

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronized (this) {
                    for (int j = 0; j < 10000000; j++) {
                        i--;
                    }
                    System.out.println("线程2结束");
                }

            }
        };
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        thread1.join();   //让主线程等待thread1执行完成再结束
        thread2.join();
        System.out.println("i = " + i);
    }
}
