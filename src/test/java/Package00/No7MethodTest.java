package Package00;

public class No7MethodTest {
    public static void main(String[] args) {
        doSome();
        byte b = 1;
        short s = 12;
        float f = (float) 1.2345;
        A.s(b);
        A.s(s);
        A.s(123);
        A.s(1234L);
        A.s(f);
        A.s(1.23456);
        A.s(true);
        A.s('A');
    }

    //  递归
    static int i = 0;

    public static void doSome() {
        i++;
        System.out.println("doSome begin");
        if (i == 10) {
            System.out.println("doSome over");
            return;
        }
        doSome();
    }
}

class A {
    public static void s(Object object) {
        System.out.println(object);
    }
}
