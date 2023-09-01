package Package25.FileStream;

import java.io.*;

/*
    int read(byte[] b)
        一次最多读取b.length个字节。
        减少硬盘和内存的交互，提高程序的执行效率
        往byte[]数组中读取
 */
public class FileInputStreamTest02 {
    //    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
//        //  改造一下向byte数组读取文件流的代码
//        try (FileInputStream input = new FileInputStream("src/test/java/Package25/File/tempFile1.txt")) {
//            byte[] bytes = new byte[1024];
//            int byteCount;
//            while ((byteCount = input.read(bytes)) != -1) {
//                builder.append(new String(bytes, 0, byteCount));
//            }
//            System.out.println(builder);
//        } catch (IOException f) {
//            f.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        //  改造一下向byte数组读取文件流的代码
        try (FileInputStream input = new FileInputStream("src/test/java/Package25/File/tempFile1.txt");
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] bytes = new byte[1024];
            int byteCount;
            while ((byteCount = input.read(bytes)) != -1) {
                //  使用ByteArrayOutputStream可以连续读取byte数组中的字节，不会出现中文乱码
                outputStream.write(bytes, 0, byteCount);
            }
            System.out.println(outputStream);
            outputStream.flush();
        } catch (IOException f) {
            f.printStackTrace();
        }
    }
}