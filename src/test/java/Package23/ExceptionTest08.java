package Package23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
    异常对象的两个方法：
        new Exception().getMessage();
        new Exception().printStackTrace();

    我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序呢？
        异常追踪信息，从上往下一行一行看。
        但是需要注意的是：SUN鞋的代码就不用看了，主要的问题是出现在自己编写的代码上。
        （蓝色第一条）
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            //  打印异常堆栈追踪信息
            //  在实际的开发中建议使用这个
            //  这行代码一定要写，不然出问题也不知道
            e.printStackTrace();
            /*
                java.io.FileNotFoundException: 123 (系统找不到指定的文件。)
	                at java.io.FileInputStream.open0(Native Method)
                    at java.io.FileInputStream.open(FileInputStream.java:195)
                    at java.io.FileInputStream.<init>(FileInputStream.java:138)
                    at java.io.FileInputStream.<init>(FileInputStream.java:93)
                    at Package23.ExceptionTest08.m3(ExceptionTest08.java:31)
                    at Package23.ExceptionTest08.m2(ExceptionTest08.java:27)
                    at Package23.ExceptionTest08.m1(ExceptionTest08.java:23)
                    at Package23.ExceptionTest08.main(ExceptionTest08.java:14)

                因为31行出问题导致27行出问题
                27行出问题导致23行出问题
                23行出问题导致14行出问题
                因此31行是错误的根源
             */
        }
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("123");
    }
}
