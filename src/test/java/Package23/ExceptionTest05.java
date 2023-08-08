package Package23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    处理异常的第一种方式：
        在方法声明的位置使用throws关键字抛出，谁调用这个方法，就把异常抛给谁，让调用者来处理
    处理异常的第二种方式：
        使用try...catch进行捕捉，在try块中编写可能会抛出异常的代码，然后在catch块中捕捉并处理异常。
        catch块中可以针对不同的异常类型编写多个catch语句，以便对不同类型的异常进行不同的处理逻辑。

 */
public class ExceptionTest05 {
    //  一般不建议在main方法上使用throws，因为这个异常如果真正发生了，一定会抛给JVM，JVM只能终止程序
    //  异常处理机制的作用就是增强程序的健壮性，也就是异常发生了也不影响程序的执行
    //  一般main方法中的异常建议使用try catch进行捕捉

    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            //  try尝试
            m1();

            //  以下代码由于m1()报错，跳过
            System.out.println("这里的代码由于在异常之后，并不会执行");
        } catch (FileNotFoundException f) {
            //  catch是捕捉异常后走的分支
            //  在catch分支中干什么？
            //      处理异常

            //try..catch把异常抓住后，这里的代码会继续执行
            System.out.println("文件不存在，可能路径错误，也可能该文件被删除！");
        }

        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    //  可以抛 FileNotFoundException 的父类异常 IOException
    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException {
        //  调用SUN jdk中某个类的构造方法
        //  这个类还没有接触过，后期IO流的时候就知道了
        //  我们只是借助这个类学习一下异常处理机制
        //  创建一个输入流对象，该流指向一个文件
        /*
            编译报错的原因：
                1、调用了一个构造方法
                2、这个构造方法的声明位置上有：throws FileNotFoundException
                3、通过类的继承结构可以得知FileNotFoundException是一个编译时异常
         */
//        new FileInputStreamTest("D:\\搜狗高速下载\\Zhuxian-debug-v1.0.0-1-dev-202305171719.apk");
        //  我们采用第一种处理方式：在方法声明的位置上使用throws继续上抛
        new FileInputStream("D:\\搜狗高速下载\\Zhuxian-debug-v1.0.0-1-dev-202305171719.apk");
        System.out.println("这里的代码由于在异常之后，并不会执行");
    }
}
