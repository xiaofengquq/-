package Package26;

/*
    不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
 */
public class ThreadTest13 {
    private static int balance = 10000;

    // 取款方法，带有线程延迟以模拟并发问题
    public boolean getBalance(int money) {
        try {
            Thread.sleep(1000); // 线程休眠1秒，用于模拟并发读取余额的情况
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

    // 查询余额方法
    public int checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        ThreadTest13 t = new ThreadTest13();
        int mainMoney = 0;

        MyRunnable13 m = new MyRunnable13(t);
        Thread t1 = new Thread(m);
        t1.start();

        // 主线程尝试取款
        if (t.getBalance(5001))
            mainMoney = 5001;

        // 打印主线程取钱总数、子线程取钱总数和账户余额
        System.out.println("主线程取钱总数: " + mainMoney);
        System.out.println("子线程取钱总数: " + m.subMoney);
        System.out.println("账户余额: " + t.checkBalance());
    }
}

class MyRunnable13 implements Runnable {
    ThreadTest13 t;
    int subMoney = 0;

    public MyRunnable13(ThreadTest13 t) {
        this.t = t;
    }

    @Override
    public void run() {
        // 子线程尝试取款
        if (t.getBalance(5001))
            subMoney = 5001;
    }
}
