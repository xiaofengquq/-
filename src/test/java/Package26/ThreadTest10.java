package Package26;

/*
    了解：关于线程的优先级
 */
public class ThreadTest10 {
    public static void main(String[] args) {
//        System.out.println("最高优先级：" + Thread.MAX_PRIORITY);     //  10
//        System.out.println("最低优先级：" + Thread.MIN_PRIORITY);     //  1
//        System.out.println("默认优先级：" + Thread.NORM_PRIORITY);    //  5
//
//        //  获取当前线程对象名称及优先级
//        Thread currentThread = Thread.currentThread();
//        System.out.println("当前线程名称：" + currentThread.getName());
//        System.out.println("当前线程优先级：" + currentThread.getPriority());

        Thread t = new Thread(new MyRunnable());
        t.setName("MyRunnable");
        t.setPriority(10);
        t.start();

        //  优先级较高的，只是抢到的CPU时间片相对多一点
        //  大概率方向更偏向于优先级较高的
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " ----> " + i);
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " ----> " + i);
        }
    }
}
