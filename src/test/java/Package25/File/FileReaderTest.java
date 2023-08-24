package Package25.File;

import java.io.FileReader;
import java.io.IOException;

/*
    FileReader:
        文件字符输入流，只能读取普通文本
        读取文本内容时，比较方便、快捷
 */
public class FileReaderTest {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("E:\\src\\-\\src\\test\\java\\Package25\\File\\tempFile1.txt")) {
            char[] chars = new char[1024];
            int readCount;
            while ((readCount = reader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, readCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
