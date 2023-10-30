package Package26;

/*
    怎么合理地终止一个线程的执行
        这种方式是很常用的
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        MyThread09 t = new MyThread09();
        t.start();
        try {
            Thread.sleep(5 * 1000);
            t.run = false;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThread09 extends Thread {
    //  打一个布尔标记
    boolean run = true;

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + " ---> " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

