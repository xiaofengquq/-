package Package25.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    FileWrite:
        文件字符输出流，写
        只能输出普通文本
 */
public class FileWriteTest {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("E:\\src\\-\\src\\test\\java\\Package25\\File\\FileWrite.txt", true)) {
            char[] chars = new char[]{'哈', '呵', '嘿'};
            writer.write(chars);

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
