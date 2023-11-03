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
        for (int i = 0; i < max; i++) {
            synchronized (st) {
                System.out.println(Thread.currentThread().getName() + "打印: " + ints[i]);
                // 通知子线程打印
                st.notify();

                // 等待子线程完成打印
                try {
                    if (i < max - 1) {
                        st.wait();
                    }
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

    public SubThread(int[] ints, int max) {
        this.ints = ints;
        this.max = max;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < max; i++) {
                System.out.println(Thread.currentThread().getName() + "打印" + ints[i]);
                // 通知主线程打印
                this.notify();

                // 等待主线程完成打印
                try {
                    if (i < max - 1) {
                        this.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

