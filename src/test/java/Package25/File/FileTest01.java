package Package25.File;

import java.io.File;
import java.io.FileNotFoundException;

/*
    File中的listFiles方法
 */
public class FileTest01 {
    //  File[] listFiles()
    //  获取当前目录下的所有子文件
    public static void main(String[] args) {
        File f = new File("src/test/java/Package25/File");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }

}
