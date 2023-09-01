package Package25.File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    File
        1、File类和4大家族没有关系，所以File类不能完成文件的读和写
        2、File对象代表什么？
            文件和目录路径名的抽象表示形式
           一个File对象有可能对应的是目录，也可能是文件
           File只是一个路径名的抽象表示形式
        3、需要掌握File类中的方法
 */
public class FileTest {
    public static void main(String[] args) {
        //  创建File对象
        File f1 = new File("src/test/java/Package25/File/file");
        //  判断File是否存在
        System.out.println(f1.exists());
        //  如果不存在，则将file已文件的形式创建出来
        try {
            if (!f1.exists()) {
                //  以文件形式创建
                f1.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //  如果希望以目录形式创建
        File f2 = new File("src/test/java/Package25/File/fileDirectory");
        //  以目录形式创建
        if (!f2.exists()) {
            f2.mkdir();
        }

        //  获取File的父路径
        String parentPath = f2.getParent();
        System.out.println(parentPath); //   src\test\java\Package25\File
        //  获取File的父File
        File parentFile = f2.getParentFile();
        //  获取绝对路径
        System.out.println("获取绝对路径：" + parentFile.getAbsolutePath());   // 获取绝对路径：E:\src\-\src\test\java\Package25\File
        //  获取文件名
        System.out.println("获取文件名：" + f2.getName());
        //  判断是否是一个目录
        System.out.println(f2.isFile());    //  false
        //  判断是否是一个文件
        System.out.println(f2.isDirectory());   //  true
        //  获取文件最后一次修改时间
        long timestamp = f2.lastModified();
        SimpleDateFormat fs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS EEE");
        System.out.println(fs.format(new Date(timestamp)));
        //  获取文件大小
        System.out.println("文件的大小是：" + f1.length() + "字节");
    }
}
