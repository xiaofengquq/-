package Package26;

/*
    线程合并
 */
public class ThreadTest12 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable12());
        t.setName("MyRunnable12");
        t.start();

        for (int i = 1; i <= 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " ----> " + i);
            //  从1000开始，MyRunnable12线程开始执行
            //  直到MyRunnable12线程执行结束，开始继续执行被暂停的线程（main线程）
            if (i == 1000) {
                //  合并线程
                try {
                    t.join();// t合并到当前线程中，当前线程受阻，t线程执行直到结束
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("main over");
    }
}

class MyRunnable12 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " ----> " + i);
        }
    }
}
