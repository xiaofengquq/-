package Package26;

/*
    实现线程的第二种方式，编写一个类继承java.lang.Runnable接口

    这种方式比较常用，因为一个类实现了接口，它还可以去继承其他类，更灵活
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //  创建一个可运行的对象
        MyThread02 myThread = new MyThread02();
        //  将可运行的对象封装成一个线程对象
        Thread t = new Thread(myThread);
        t.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程--->" + (i + 1));
        }
    }
}
//  这并不是一个线程类，是一个可运行类，他还不是一个线程
class MyThread02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("分支线程--->" + (i + 1));
        }
    }
}
