package Package25.FileStream;

import java.io.*;

/*
    使用FileReader和FileWrite copy文本文件
 */
public class Copy02 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/test/java/Package25/File/Copy02.java");
             FileWriter writer = new FileWriter("src/test/java/Package25/File/copy02.txt")) {
            char[] chars = new char[1024];
            int readCount;
            while ((readCount = reader.read(chars)) != -1) {
                writer.write(chars, 0, readCount);
            }

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}