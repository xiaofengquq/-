package Package23;
/*
    关于try..catch中的finally子句
        1、在finally子句中的代码是最后执行的，并且是一定会执行的
            即使try语句块中的代码出现了异常。
            finally子句必须和try一起出现，不能单独编写
        2、finally语句通常使用在哪些情况下呢？
            通常在finally语句块中完成资源的释放/关闭。
            因为finally中的语句一定会执行
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest09 {
    public static void main(String[] args) {
        FileInputStream f = null;
        try {
            f = new FileInputStream("123");

            String s = null;
            s.toString();

            //  流使用完需要关闭，因为流是占用资源的。
            //  即使以上程序出现异常，流也必须要关闭！
            //  close()方法放在这里有可能导致流没有关闭
            //  f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //  流的关闭放在这里比较保险
            //  finally中的代码是一定会执行的
            if (f != null) {
                try {
                    //  close()方法有异常，采用捕捉的方式
                    f.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
