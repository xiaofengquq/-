package Package27;

import java.io.FileInputStream;
import java.io.IOException;

/*
    研究一下文件路径的问题
 */
public class ClassAboutPath {
    public static void main(String[] args) {
        /*
            这种方式的路径，缺点是移植性差
            在IDEA中默认的当前路径是project的根路径
            这个代码假设离开了IDEA，换到了其他位置
            可能当前路径就不是project的根路径了，这时这个路径就无效了

            因此需要绝对路径
            注意：
                使用绝对路径的前提是，这个文件必须在类路径下
                凡是在src下，都是类路径
                src是类的根路径
        */
        try (FileInputStream fis1 = new FileInputStream("src/test/java/Package27/classinfo.properties");) {
            /*
                解释一下：
                    Thread.currentThread()  当前线程对象
                    getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器对象
                    getResource()   这时类加载器对象的方法，当前线程的类加载器默认从类的 根路径 下加载资源
             */

            //  需要将src文件夹标记为 源代码根目录，不然getResource()会返回null
            //  .getPath()会报 NullPointException

            //  这样写的好处：
            //      可以跨操作系统
            String path1 = Thread.currentThread().getContextClassLoader()
                    .getResource("classinfo123.properties").getPath();
            //  /D:/IdeaProjects/-/target/classes/classinfo123.properties
            System.out.println(path1);

            //  获取db.properties文件的绝对路径
            String path2 = Thread.currentThread().getContextClassLoader()
                    .getResource("test/java/Package27/db.properties").getPath();
            System.out.println(path2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
