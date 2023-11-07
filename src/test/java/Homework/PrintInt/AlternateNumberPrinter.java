package Homework.PrintInt;

public class AlternateNumberPrinter {
    public static void main(String[] args) {
        int max = 100;
        int[] ints = new int[max];
        for (int i = 0; i < max; i++) {
            ints[i] = i + 1;
        }
        SubThread st = new SubThread(ints, max);
        st.setName("SubThread");
        st.start();
        for (int i = 1; i < max; i += 2) {
            synchronized (SubThread.lock) {
                System.out.println(Thread.currentThread().getName() + "打印: " + ints[i - 1]);
                // 通知子线程打印
                SubThread.lock.notify();

                // 等待子线程完成打印
                try {
                    SubThread.lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class SubThread extends Thread {
    int[] ints;
    int max;
    final static Object lock = new Object();

    public SubThread(int[] ints, int max) {
        this.ints = ints;
        this.max = max;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 2; i <= max; i += 2) {
                System.out.println(Thread.currentThread().getName() + "打印" + ints[i - 1]);
                // 通知主线程打印
                lock.notify();

                // 等待主线程完成打印
                try {
                    if (i != max) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

