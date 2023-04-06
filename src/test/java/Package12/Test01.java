package Package12;

import java.util.Scanner;

/**
 * 猜数字游戏
 * 一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
 * 另外再定义一个类B，对A类的实例变量v进行猜测。
 * 如果大了则提示大了
 * 小了则提示小了
 * 等于则提示猜测成功
 */

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入待猜测的数字: ");
        A a = new A();
        a.setV(scanner.nextInt());
        B b = new B();
        b.guessSize(a);
    }
}

class A {
    private int v;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}

class B {
    public void guessSize(A a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("请猜测: ");
        int i = scanner.nextInt();
        if (i > a.getV()) {
            System.out.println("猜大了！");
            guessSize(a);
        } else if (i < a.getV()) {
            System.out.println("猜小了 ");
            guessSize(a);
        } else {
            scanner.close();
            System.out.println("猜对了！");
        }
    }
}