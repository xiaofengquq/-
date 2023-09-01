package Package25.FileStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.FileInputStream:
        1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
        2、字节的方式，完成输入及读取的操作（硬盘 ——> 内存）
 */
public class FileInputStreamTest {
    /*
        分析以下程序的缺点：
            一次读取一个字节byte，这样内存和硬盘交互太频繁，
            基本上时间/资源都耗费在交互上面了
        需要使用一次读取多个字节的方式
     */
    public static void main(String[] args) {
        FileInputStream f = null;
        try {
            //  创建文件字节输入流对象
            f = new FileInputStream("yzw"); //  abcdefg
            int byteRead;
            while ((byteRead = f.read()) != -1) {
                System.out.println(byteRead);   // a == 97，read()方法返回的是字节本身
            }
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
