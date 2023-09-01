package Package25.FileStream;


import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件字节输出流，负责写
        从内存到硬盘
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        //  myFile文件不存在的时候会自动新建
//        try (FileOutputStream output = new FileOutputStream("E:\\src\\-\\src\\test\\java\\Package25\\File\\myFile.txt")) {
        try (FileOutputStream output = new FileOutputStream("src/test/java/Package25/File/FileOutput.txt"
                , true)) {  //  增加参数append == true，可以以追加的方式在文件末尾写入，不会清空源文件
            byte[] bytes = new byte[]{97, 98, 99, 100};
            //  将byte数组全部写出
            output.write(bytes);

            //  将byte数组一部分写出
            output.write(bytes, 0, 2);  //  写出后文件为abcdab

            //  写完之后，一定要刷新
            output.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
