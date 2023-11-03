package Package26;
/*
    线程 t1 和 t2，它们分别尝试获取两个不同的锁（obj1 和 obj2）。
    由于线程 t1 首先获取了 obj1 锁，而线程 t2 首先获取了 obj2 锁，
    它们互相等待对方释放锁，导致死锁的情况

    死锁发生以后：
        不会出现异常，也不会出现错误
        程序一直将在那里
        这种错误最难调试
 */
public class ThreadTest16 {
    public static void main(String[] args) {
        final Object obj1 = new Object(); // 创建对象 obj1 作为第一个锁
        final Object obj2 = new Object(); // 创建对象 obj2 作为第二个锁

        // 线程 t1，尝试获取 obj1 和 obj2 的锁
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1) { // 获取 obj1 的锁
                    System.out.println("t1: Holding obj1");
                    try {
                        Thread.sleep(1000); // 线程 t1 休眠 1 秒
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("t1: Waiting obj2");
                    synchronized (obj2) { // 尝试获取 obj2 的锁
                        System.out.println("t1: Got obj2");
                    }
                }
            }
        });

        // 线程 t2，尝试获取 obj2 和 obj1 的锁
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj2) { // 获取 obj2 的锁
                    System.out.println("t2: Holding obj2");
                    try {
                        Thread.sleep(1000); // 线程 t2 休眠 1 秒
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("t2: Waiting obj1");
                    synchronized (obj1) { // 尝试获取 obj1 的锁
                        System.out.println("t2: Got obj1");
                    }
                }
            }
        });

        t1.start(); // 启动线程 t1
        t2.start(); // 启动线程 t2
    }
}
