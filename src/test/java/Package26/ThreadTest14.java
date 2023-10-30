package Package26;

/*
    复制ThreadTest13代码，只需要修改getBalance()方法
    即可保证线程安全
 */

public class ThreadTest14 {
    private int balance = 10000;

    /*  线程同步语法
        synchronized () {
           线程同步代码块
        }
    synchronized后面小括号中的“数据”是相当关键的
    这个数据必须是多线程共享的数据，才能达到多线程排队。

    ()中写什么？
        那要看你想让哪些线程同步
        假设t1、t2、t3、t4、t5 5个线程，
        只希望t1、t2、t3排队，t4、t5不需要排队的话
        一定要在()内写一个t1、t2、t3共享的对象，这个对象对于t4、t5来说不是共享的

        在java语言中，任何一个对象都有一把”锁“，其实这把锁就是标记。（只是把它叫做锁）
        100个对象，就有100把锁

        以下代码的执行原理
            1、假设main线程和t1线程并发，开始执行以下代码时，肯定有先后顺序
            2、假设main先执行，遇到了synchronized，这个时候会自动找后面”共享对象“的对象锁，
                找到之后，占有这把锁，然后执行同步代码块中的程序，在程序执行过程中一直都是占有状态
                知道同步代码块执行结束，这把锁才会释放
*/
    public boolean getBalance(int money) {
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (balance - money < 0) {
                System.out.println("余额不足，取钱失败");
                return false;
            } else {
                balance = balance - money;
                return true;
            }
        }
    }

    public synchronized int checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        ThreadTest14 t = new ThreadTest14();
        int mainMoney = 0;

        MyRunnable14 m = new MyRunnable14(t); // 传递同一个ThreadTest14对象
        Thread t1 = new Thread(m);
        t1.start();

        if (t.getBalance(5001))
            mainMoney = 5001;

        System.out.println("主线程取钱总数" + mainMoney);
        System.out.println("子线程取钱总数" + m.subMoney);
        System.out.println("账户余额" + t.checkBalance());
    }
}

class MyRunnable14 implements Runnable {
    ThreadTest14 t;
    int subMoney = 0;

    public MyRunnable14(ThreadTest14 t) {
        this.t = t;
    }

    @Override
    public void run() {
        if (t.getBalance(5001))
            subMoney = 5001;
    }
}
