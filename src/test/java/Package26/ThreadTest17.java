package Package26;
/*
    守护线程
        public final void setDaemon(boolean on)
        设置为true即可将线程设置为守护线程
 */
public class ThreadTest17 {
    public static void main(String[] args) {
        Thread t = new BackUpDataThread();
        t.setName("数据备份线程");
        //  启动线程之前，将线程设置为守护线程
        t.setDaemon(true);
        t.start();

        //  主线程是用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " -----> " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class BackUpDataThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        //  由于该线程被设置为守护线程，当用户线程结束，即使是死循环也会自动退出
        while (true) {
            System.out.println(Thread.currentThread().getName() + " -----> " + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}