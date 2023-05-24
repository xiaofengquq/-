package Package23;

public class ExceptionTest04 {
    //  第一种处理方式：在方法声明的位置上继续使用：throws，来完成异常的继续上抛，抛给调用者
    //  上抛类似于推卸责任（继续把异常传递给调用者）
//    public static void main(String[] args) throws ClassNotFoundException {
//        doSome();
//    }

    //  第二种方式，try catch捕捉异常
    //  捕捉等同于把异常拦下了，异常真正解决了（调用者没有感知）

//  注意：
//      只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行。
//      另外需要注意，try语句中的某一行出现异常，该行后面的代码不会执行。
//      try..catch捕捉异常后，后续代码可以执行

//  在以后的开发中，处理编译时异常，应该上报还是捕捉呢？
//      如果希望调用者来处理，选择throws上报
//      其他情况选择捕捉
    public static void main(String[] args) {
        try {
            doSome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException {
        System.out.println("Do some!");
    }
}
