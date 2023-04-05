package Package07;

public class InterfaceTest03 {
    public static void main(String[] args) {
        //多态应该怎么使用呢？
        A1 a1 = new D1();
        B1 b1 = new D1();
        //a1底层是个D1，D1同时实现了A1和B1
        //所以a1可以强转为B1
        b1 = (B1) a1;
        //D1和C1没有继承关系，但是写代码的时候，可以互转，编译器不会报错
        //但是运行的时候可能会报
        // Exception in thread "main" java.lang.ClassCastException
//        C1 c1 = (C1) new D1();
        //因此代码要写为
        D1 d1 = new D1();
        C1 c1;
        if (d1 instanceof C1) {
            c1 = (C1) new D1();
        } else {
            c1 = null;
        }
    }
}

interface A1 {
    void m1();
}

interface B1 {
    void m2();
}

interface C1 {
    void m3();
}

/**
 * 一个类可以同时实现多个接口
 * java中类和类只支持单继承。实际上单继承是为了简单而出现的，
 * 现实世界中存在多继承，java中的接口弥补的单继承带来的缺陷。
 */
class D1 implements A1, B1 {
    @Override
    public void m1() {
        System.out.println("m1 starts!");
    }

    @Override
    public void m2() {
        System.out.println("m2 starts!");
    }
}