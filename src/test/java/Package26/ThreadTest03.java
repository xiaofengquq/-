package Package26;
/*
    采用匿名内部类可以吗？
        可以
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("分支线程--->" + (i + 1));
                }
            }
        });
        t.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程--->" + (i + 1));
        }

    }
}
