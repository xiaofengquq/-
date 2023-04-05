package Package07;

public class InterfaceTest02 {
    public static void main(String[] args) {
        //使用多态，面向接口变成，实际底层还是MyMathImp1类
        MyMath myMathImp1 = new MyMathImp1();
        System.out.println(myMathImp1.sum(1, 2));;
        System.out.println(myMathImp1.sub(1, 2));;
    }
}

class MyMathImp1 implements MyMath {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}

interface MyMath {
    double PI = 3.1415926;

    int sum(int a, int b);

    int sub(int a, int b);
}