package Package23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    深入try、catch
        1、catch后面小括号中的类型，可以是具体的异常类型，也可以是其父类型
        2、catch可以写多个。建议catch的时候，精确地一个一个处理（不要写其父类）
            这样有利于程序的调试
        3、catch有多个的时候，从上到下，必须遵循从小到大的原则
 */
public class ExceptionTest06 {
    public static void main(String[] args) {

        try {
            //  创建输入流
            FileInputStream f = new FileInputStream("D:\\桌面\\远程办公\\IM\\1.txt");

            System.out.println(100 / 0);    //  这个异常是运行时异常，编写程序时可以处理，也可以不处理
        } catch (FileNotFoundException | ArithmeticException e) {
            System.out.println("文件不存在或数字运算异常");
        }

        System.out.println("main over");
    }
}
