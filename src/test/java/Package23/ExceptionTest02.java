package Package23;

import java.util.Arrays;

/**
 *  java语言中异常是以什么形式存在的呢？
 *      1、java中异常以类的形式存在，每一个异常类都可以创建异常对象
 *      2、异常在现实生活是什么样的？
 *          火灾（异常类）
 *              2008年8月8日，小明家着火了（异常对象）
 *              2008年8月9日，小刚家着火了（异常对象）
 *              2008年9月8日，小红家着火了（异常对象）
 *          类是：模板
 *          对象是：实际存在的个体
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //  通过“异常类”实例化“异常对象”
        NumberFormatException n = new NumberFormatException("数字格式化异常");
        //  java.lang.NumberFormatException: 数字格式化异常
        System.out.println(n);

        //  通过“异常类”创建“异常对象”
        System.out.println(new NullPointerException("空指针异常发生了"));
    }
}
