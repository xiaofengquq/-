package Package25.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy01 {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("D:\\log.txt");
             FileOutputStream output = new FileOutputStream("src/test/java/Package25/File/copy01.txt")) {
            byte[] bytes = new byte[1024];
            int readCount;
            while ((readCount = input.read(bytes)) != -1) {
                output.write(bytes, 0, readCount);
            }

            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
