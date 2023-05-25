package Package23;

/*
    final finally finalize 有什么区别？
    final 关键字
        final修饰的类无法继承
        final修饰的方法无法覆盖
        final修饰的变量不能重新赋值

    finally 关键字
        和try一起联合使用
        finally语句块中的代码是必须执行的

    finalize 标识符
        是Object类中的一个方法。
        JVM垃圾回收器负责调用
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        //  final是个关键字，表示最终的。不变的
        final int i = 100;

        //  finally也是一个关键字，和try联合使用，使用在异常处理机制中
        //  在finally语句块中的代码是一定会执行的
        try {

        } finally {
            System.out.println("finally...");
        }

        //  finalize()是Object类中的一个方法，作为方法名出现
        //  finalize是标识符
        //  finalize()方法是JVM的垃圾回收器来调用
        Object obj = new Object();

    }
}
