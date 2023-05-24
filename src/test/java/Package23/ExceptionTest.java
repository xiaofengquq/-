package Package23;
/**
 * 1、什么是异常，异常机制有什么用？
 *      程序执行过程中发生了不正常的情况，而这种不正常的情况叫做：异常
 * 2、java把异常信息打印输出到控制台，供程序员参考，程序员看到异常信息之后，可以对程序进行修改，让程序更加的健壮
 *
 *      什么是异常：程序执行过程中的不正常情况
 *      异常的作用：增强程序的健壮性
 *      异常分为两种：
 *          编译时异常
 *          运行时异常（用非、未来形容的都是运行时异常）
 *
 * 3、以下程序执行，控制台出现了：
 *      Exception in thread "main" java.lang.ArithmeticException: / by zero
 * 	        at Package23.ExceptionTest.main(ExceptionTest.java:19)
 * 	  这个信息被我们称为异常信息，这个信息是JVM打印的
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b;  //  实际上JVM在执行到此处的时候，会new异常对象: new ArithmeticException(" / by zero");
                        //  并且JVM将new的异常对象抛出，打印输出信息到控制台了。
    }

}
