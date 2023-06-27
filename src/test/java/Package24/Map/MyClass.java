package Package24.Map;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyClass {

    //  声明一个静态内部类
    private static class InnerClass {

        //  静态方法
        public static void m1() {
            System.out.println("静态内部类的 静态方法 m1()执行");
        }

        public void m2() {
            System.out.println("静态内部类的 实例方法 m2()执行");
        }
    }

    public static void main(String[] args) {
        MyClass.InnerClass.m1();

        //  创建静态内部类对象
        MyClass.InnerClass mi = new MyClass.InnerClass();
        mi.m2();

        //  给一个Set集合

        //  由于MyClass.InnerClass并没有实现 Comparable 接口，因此不能用这个内部类当做参数来创建TreeSet
//        Set<MyClass.InnerClass> set = new TreeSet<>();

        //  该Set集合中存储的是 MyClass.InnerClass 类型
        Set<MyClass.InnerClass> set1 = new HashSet<>();
        set1.add(new MyClass.InnerClass());
        set1.add(new MyClass.InnerClass());
        set1.add(new MyClass.InnerClass());

        //  该Set集合中存储的是 String 类型
        Set<String> set2 = new HashSet<>();
    }
}
