package Package26;

/*
    线程让位，当前线程暂停，回到就绪状态
    静态方法：Thread.yield();
 */
public class ThreadTest11 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable11());
        t.setName("MyRunnable11");
        t.start();

        for (int i = 1; i <= 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " ----> " + i);
        }
    }
}

class MyRunnable11 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            if (i % 100 == 0) {
                Thread.yield();
                System.out.println("\n" + "子线程让位" + "\n");//  当前线程暂停一下，让给主线程
            }
                System.out.println(Thread.currentThread().getName() + " ----> " + i);
        }
    }
}
