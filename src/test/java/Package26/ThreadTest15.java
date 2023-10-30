package Package26;

public class ThreadTest15 {
    private int balance = 10000;

    /*
        在实例方法上可以使用synchronized吗？
            可以的
            但是synchronized如果放在实例方法上，一定锁的是this
            因此这种方式不灵活

            另外还有一个缺点：synchronized出现在实例方法上，
            表示整个方法体都需要同步，可能会无故扩大同步的范围，造成程序的执行效率降低
            所以这种方式不常用
     */
    public synchronized boolean getBalance(int money) {
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

class MyRunnable15 implements Runnable {
    ThreadTest14 t;
    int subMoney = 0;

    public MyRunnable15(ThreadTest14 t) {
        this.t = t;
    }

    @Override
    public void run() {
        if (t.getBalance(5001))
            subMoney = 5001;
    }
}
