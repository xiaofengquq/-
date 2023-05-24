package Package23;
/*

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest10 {
    public static void main(String[] args) {
        /*
            try和finally，可以在没有catch的情况下使用
            try不能单独使用
            try finally可以联合使用
         */

        /*
            以下代码的执行顺序：
                先执行try
                再执行finally
                最后执行return（return语句只要执行方法必然结束）
         */
        try {
            System.out.println("try..");
            return;
        } finally {
            System.out.println("finally..");
        }
    }
}
