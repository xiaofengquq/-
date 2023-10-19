package Package26;

/*
    关于Thread.sleep()方法的面试题
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t = new MyThread06();
        t.setName("t");
        t.start();

        //  调用sleep方法
        try {
            //  问题：这行代码会让线程t进入休眠状态吗
            t.sleep(1000 * 5);//  在执行的时候会转换成：Thread.sleep(1000 * 5);
                                    //  这行代码的作用是：让当前线程进入休眠，也就是说main线程进入休眠。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  5s后执行这里的代码
        System.out.println("hello world");
    }
}

class MyThread06 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " ----> " + i);
        }
    }
}
