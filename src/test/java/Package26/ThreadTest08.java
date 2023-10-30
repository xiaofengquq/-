package Package26;

/*
    怎么强行终止一个线程
        stop方法存在很大的缺点，会丢失数据。
        因为这种方式是直接将线程杀死了
        线程没有保存的数据将会丢失，不建议使用
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new MyThread08();
        t.start();
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.stop(); // 已过时，不建议使用
    }
}

class MyThread08 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ---> " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

