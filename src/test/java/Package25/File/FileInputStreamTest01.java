package Package25.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    int read(byte[] b)
        一次最多读取b.length个字节。
        减少硬盘和内存的交互，提高程序的执行效率
        往byte[]数组中读取
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream f = null;
        StringBuilder builder = new StringBuilder();
        try {
            //  IDEA默认当前路径是工程Project的根目录
            f = new FileInputStream("tempFile");
            //  如果文件不在根目录下，文件路径需要从根目录开始写起
            f = new FileInputStream("src/test/java/Package25/File/tempFile1");

            //  开始读，采用byte数组，一次读取多个字节，最多读取“数组.length”个字节
            byte[] bytes = new byte[4];
            //  这个方法的返回值是：读取到的字节数量，不是字节本身
            int readCount = f.read(bytes);  //  第一次能读到4个字节
            System.out.println(readCount);  //  4
            //  读取了多少个字节，就转换多少个字节
            if (readCount > 0)
                builder.append(new String(bytes), 0, readCount);

            readCount = f.read(bytes);  //  第二次只能读到2个字节
            System.out.println(readCount);  //  2
            if (readCount > 0)
                builder.append(new String(bytes), 0, readCount);

            readCount = f.read(bytes);  //  第三次一个字节都读不到
            System.out.println(readCount);  //  -1
            if (readCount > 0)
                builder.append(new String(bytes), 0, readCount);

            System.out.println(builder);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
