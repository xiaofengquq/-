package Package23;

/*
    异常对象有两个非常重要的方法：
    获取异常简单的描述信息：
        new Exception().getMessage();
    打印异常追踪的堆栈信息：
        new Exception().printStackTrace();
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("空指针异常");
        //  获取异常简单的描述信息
        //  这个信息实际上是构造方法的String参数
        System.out.println(e.getMessage());

        //  打印异常追踪的堆栈信息
        //  java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式
        e.printStackTrace();
        for (int i = 0; i < 5000; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Hello World");
    }
}
