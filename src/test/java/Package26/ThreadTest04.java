package Package26;

/*
    1、怎么获取当前线程对象？
        Thread t = public static native Thread currentThread();
    2、获取线程对象的名字
        线程对象.getName();
    3、修改线程对象的名字
        线程对象.setName("线程名称");
 */
public class ThreadTest04 {
    public static void main(String[] args) {

        MyThread04 myThread04 = new MyThread04();
        Thread t1 = new Thread(myThread04);
        t1.setName("t1");
        t1.start();

        Thread t2 = new Thread(myThread04);
        t2.setName("t2");
        t2.start();
    }
}
class MyThread04 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("当前线程：" + Thread.currentThread().getName() + " --> " + i);
        }
    }
}
