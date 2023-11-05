package Package26;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask; //  JUC包，java的并发包

/*
    实现线程的第三种方式
        实现Callable接口
    new FutureTask().get()方法会导致当前线程阻塞
 */
public class ThreadTest18 {
    public static void main(String[] args) {
        //  第一步，创建“未来任务类”对象
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception { //  call方法相当于run方法，只不过这个有返回值
                System.out.println("call method begin");
                Thread.sleep(2 * 1000);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });
        //  FutureTask和Runnable可以用相同的用法
        Thread t = new Thread(futureTask);
        t.start();
        //  怎么在main方法获取t线程的执行结果
        try {
            Object o = futureTask.get();
            System.out.println("线程执行结果：" + o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //  main方法这里的程序必须等待get()方法的执行结束
        //  而get()方法执行结束有可能需要很久，因为get()方法是为了拿另一个线程的执行结果
        //  而另一个线程的执行是需要时间的
    }
}
