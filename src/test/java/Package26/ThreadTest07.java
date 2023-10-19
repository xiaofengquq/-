package Package26;

/*
    怎么唤醒一个正在休眠的线程
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t = new MyThread07();
        t.start();

        //  希望5秒之后，t线程醒来
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  这里相当于中断了t线程的执行，进入catch语句运行
        t.interrupt();
    }
}

class MyThread07 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "----> begin");
        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            //  由于这里没有写return语句，或者throw new InterruptedException();
            //  因此程序只是会报错，还是会继续执行后面的语句
            //  如果不想看到异常信息，只想中断后打印end，那么把e.printStackTrace();注释即可
        }
        System.out.println(Thread.currentThread().getName() + "----> end");
    }
}
