package Package23;

/*
    1、SUN提供的JDK内置的异常肯定是不够的用的。在实际的开发中，有很多业务。
    这些业务出观异常之后，JDK中都是没有的。那么异常我们程序员可以自己定义吗?
        可以。
    2、java中怎么自定义异常呢？
        分为两步：
            第一步：编写一个类继承Exception或者RuntimeException
            第二步：提供两个构造方法，一个无参，一个带有String参数

    死记硬背即可
 */
public class MyException extends Exception {    //  编译时异常

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

class MyException01 extends RuntimeException {  //  运行时异常

}
