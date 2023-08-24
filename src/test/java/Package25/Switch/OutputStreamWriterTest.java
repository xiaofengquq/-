package Package25.Switch;

import java.io.*;

public class OutputStreamWriterTest {
    public static void main(String[] args) {
        try (BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("E:\\src\\-\\src\\test\\java\\Package25\\Switch\\OutputStreamWriter.txt")
                ))) {
            // 定义一个字符数组，包含一些中文字符
            char[] chars = new char[]{'啵', '么', '嘿', '哈'};

            // 将字符数组写入到输出流中
            output.write(chars);

            // 刷新缓冲区，确保数据写入文件
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
