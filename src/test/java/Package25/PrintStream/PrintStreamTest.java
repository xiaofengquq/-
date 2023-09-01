package Package25.PrintStream;

import java.io.PrintStream;
/*
    java.io.PrintStream，标准输出流，默认输出到控制台
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        //  联合起来写
        System.out.println("123");  //  其实调用的是标准输出流PrintStream的println方法（System.out返回的是PrintStream）

        //  分开写
        PrintStream ps = System.out;
        ps.println("321");

        //  标准输出流不需要手动关闭

        //  可以改变标准输出流的输出方向吗？
        //      可以
        //  标准输出流不再指向控制台，指向log文件
    }
}
