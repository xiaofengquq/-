package Package26;

/*
    关于线程的sleep方法
        public static native void sleep(long millis) throws InterruptedException;
        1、静态方法
        2、参数是毫秒
        3、作用：让当前线程休眠，进入“阻塞状态”，放弃占有的CPU时间片，让给其他线程使用
            出现在哪个线程，就让当前线程进入休眠
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000 * 5);
            //  5s以后执行这里的代码
            System.out.println("hello world");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
