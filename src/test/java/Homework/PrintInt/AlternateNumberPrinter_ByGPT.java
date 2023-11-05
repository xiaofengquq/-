package Homework.PrintInt;

public class AlternateNumberPrinter_ByGPT {
    public static void main(String[] args) {
        // 创建一个共享的锁对象
        final Object lock = new Object();

        // 创建一个共享的标志，用于通知主线程退出
        final boolean[] done = {false};

        // 创建一个子线程，负责打印奇数
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i += 2) {
                    synchronized (lock) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                        lock.notify();
                        if (i == 99) {
                            done[0] = true; // 打印完成后通知退出
                        }
                        try {
                            if (i < 99) {
                                lock.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "OddThread");

        // 创建一个子线程，负责打印偶数
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= 100; i += 2) {
                    synchronized (lock) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                        lock.notify();
                        if (i == 100) {
                            done[0] = true; // 打印完成后通知退出
                        }
                        try {
                            if (i < 100) {
                                lock.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "EvenThread");

        // 启动子线程
        oddThread.start();
        evenThread.start();

        // 等待子线程执行完成并通知退出
        try {
            oddThread.join();
            evenThread.join();
            while (!done[0]) {
                Thread.sleep(100); // 等待打印完成并通知退出
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

