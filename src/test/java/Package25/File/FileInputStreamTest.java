package Package25.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.FileInputStream:
        1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
        2、字节的方式，完成输入及读取的操作（硬盘 ——> 内存）
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream f = null;
        try {
            //  创建文件字节输入流对象
            f = new FileInputStream("E:\\src\\-\\yzw"); //  abcdefg
            System.out.println(f.read());   // a == 97，read()方法返回的是字节本身
            System.out.println(f.read());   // b == 98
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //  在finally语句块中确保流一定关闭
            if (f != null) {    //  避免空指针异常
                //  关闭流的前提是：流不是空，流是null的时候没必要关闭
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
