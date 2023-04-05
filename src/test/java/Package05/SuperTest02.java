package Package05;

public class SuperTest02 {
    public static void main(String[] args) {
        new C();
        /**
         * 执行结果：
         *      A的无参构造方法执行
         *      B的有参构造方法执行(String)
         *      C的无参构造方法执行(String, int)
         *      C的无参构造方法执行(String)
         *      C的无参数构造执行
         */
    }
}

class A {
    public A() {//5
        System.out.println("A的无参构造方法执行");
    }
}

class B extends A {
    public B() {
        System.out.println("B的无参构造方法执行");
    }

    public B(String s) {
        super();//4
        System.out.println("B的有参构造方法执行(String)");
    }
}

class C extends B {
    public C() {
        this("张三");//1
        System.out.println("C的无参数构造执行");
    }

    public C(String name) {
        this(name, 20);//2
        System.out.println("C的无参构造方法执行(String)");
    }

    public C(String name, int i) {
        super(name);//3
        System.out.println("C的无参构造方法执行(String, int)");
    }
}

