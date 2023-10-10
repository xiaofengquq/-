package Package26;
/*
    分析以下程序有几个线程（除垃圾回收器以外
        1个线程（因为程序只有一个栈
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    private static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        System.out.println("m2 over");
    }
}
