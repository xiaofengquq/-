package Package25.Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    BufferedReader:
        带有缓冲区的字节输入流
        使用这个流时，不需要自定义char数组，自带缓冲
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("E:\\src\\-\\src\\test\\java\\Package25\\Buffer\\tempFile2.txt");

             // 当一个流的构造方法中需要一个流时，被传进来的流叫做：节点流
             // 外部负责包装的流，叫做 包装流，也叫：处理流
             // 关闭流的时候，只需要关闭外面的包装流（或者叫处理流）即可，不用关闭里面的节点流，节点流会自动关闭
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            //  第一行
            String currentLine;
            //  bufferedReader.readLine()方法，读取一行文本，但是不带最后的换行符
            //  一次读一行，最后一行读完返回null
            while ((currentLine = bufferedReader.readLine()) != null) {
                //  最后换行和原文本一样是因为这里打印使用的是println
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
