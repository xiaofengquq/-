public class No10ThisTest {
    public static void main(String[] args) {
        new No10ThisTest().run();
    }

    public static void staticMethod() {
//        this.test(); 会报错
//        因为静态方法中无法调用实例方法
        System.out.println("StaticMethod worked");
    }

    public void test() {
        System.out.println("Test worked");
    }

    public void run() {
        System.out.println("run worked");
        No10ThisTest no10ThisTest = new No10ThisTest();
        no10ThisTest = null;
        no10ThisTest.staticMethod();
        //编译允许实例对象调用静态方法，但是这种情况下实例对象为空不会报空指针异常
        test();//实例方法中可以调用实例方法（因为调用run方法的前提的存在对象
        staticMethod();//实例方法中可以调用静态方法
    }
}
