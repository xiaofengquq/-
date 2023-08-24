package Package25.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    FileInputStream类的其他常用方法
        int available();    返回流当中剩余没有被读到的字节数量
        long skip();        跳过几个字节不读
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        try (FileInputStream f = new FileInputStream("src/test/java/Package25/File/tempFile1.txt")){
            byte[] bytes = new byte[5];
            f.read(bytes);
            System.out.println(f.available());  //  剩下270174个字节没有读
            f.skip(10);
            System.out.println(f.available());  //  跳过10个字节后，还剩270164个字节没有读
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
