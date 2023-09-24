package Package26;

/*
    实现线程的第一种方式：
        编写一个类，直接继承java.lang.Thread，重写run方法

        怎么创建线程对象？
            new就行
        怎么启动线程呢？
            调用线程对象的start方法
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        //  这里是main方法，这里的代码属于主线程，在主栈中运行。
        //  新建一个分支线程对象
        MyThread01 myThread = new MyThread01();
//        myThread.run(); //  如果直接调用run方法，就是单线程

        //  启动线程
        //  start方法的作用是： 启动一个分支线程，在JVM中开辟一个新的栈空间
        //  这段代码的任务只是为了开启新的栈空间，
        //      ### 只要栈空间开出来，start()方法就结束了 ###
        //  启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部
        //  run方法在分支栈的栈底部，main方法在主栈的栈底部，run和main是平级的
        myThread.start();
        //  这里的代码还是运行在主线程中
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程--->" + (i + 1));
        }
    }
}

class MyThread01 extends Thread {
    @Override
    public void run() {
        //  编写程序，这段程序运行在分支线程中（分支栈）
        for (int i = 0; i < 10000; i++) {
            System.out.println("分支线程--->" + (i + 1));
        }
    }
}
