package Package23;

public class ExceptionTest03 {
    public static void main(String[] args) {
        //  这里doSome方法声明位置上有：throws ClassNotFoundException
        //  ClassNotFoundException为编译时异常，我们在调用doSome方法的时候必须对这种异常进行预先的处理。
        //  如果不处理，编译器就报错
//        doSome();
    }

    /*
        编译时异常是Exception类及其子类的派生类，但不包括RuntimeException及其子类。
        运行时异常是RuntimeException类及其子类的派生类。
     */
    public static void doSome() throws ClassNotFoundException {
        System.out.println("Do some!");
    }
}
