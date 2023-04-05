package Package03;

/**
 * 关于java语言当中的多态语法机制:
 * 1、Animal、Cat、Bird三个类之间的关系:
 * Cat维承Animal
 * Bird维承Animal
 * Cat和Bird之间没有任何继承关系
 * 2、面向对象三大特征: 封装、继承、多态
 * 3、关于多态中涉及到的几个概念
 * *向上转型(upcasting)
 * 子类型 --> 父类型
 * 又被称为：自动类型转换
 * *向下转型(downcasting)
 * 父类型 --> 子类型
 * 又被称为：强制类型转换、【需要添加强制类型转换符】
 * *需要记忆：
 * 无论是向上转型还是向下转型，两种类型之间必须要有继承关系。
 */

public class OverrideTest {
    public static void main(String[] args) {
        //以前编写的代码
//        Animal a1 = new Animal();
//        a1.move();
//
//        Cat c1 = new Cat();
//        c1.move();
//        c1.catchMouse();
//
//        Bird b1 = new Bird();
//        b1.move();

        //使用多态机制
        /**
         * 1、Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
         * 2、Cat is a Animal【合理的】
         * 3、new Cat()创建的对象的类型是cat，a2这个引用的数据类型是Animal，
         *      可见它们进行了类型转换子类型转换成父类型，
         *      称为向上转型/upcasting，或者称为自动类型转换。
         * 4、Java中允许这种语法: 父类型引用指向子类型对象。
         * */

        Animal a2 = new Cat();
        /**
         * 1、java程序永远都分为编译阶段和运行阶段。
         * 2、先分析编译阶段，再分析运行阶段，编译无法通过，根本是无法运行的。
         * 3、编译阶段编译器检查a2这个引用的数据类型为Animal，由于Animal.class字节码当中有move()方法，
         *      所以编译通过了。这个过程我们称为静态绑定，编译阶段绑定。
         *      只有静态绑定成功之后才有后续的运行。
         * 4、在程序运行阶段，JVM堆内存当中真实创建的对象是Cat对象，
         *      那么以下程序在运行阶段定会调用Cat对象的move()方法，
         *      此时发生了程序的动态绑定，运行阶段绑定。
         * 5、无论是Cat类有没有重写move方法，运行阶段一定调用的是Cat对象的move方法，
         *      因为底层真实对象就是Cat对象。
         * 6、父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态/状态，
         *      这种机制可以成为一种多态语法机制。
         * */
        a2.move();

        //将Animal对象强转为Cat对象，该对象中存在catchMouse()方法
        Cat c2 = (Cat) a2;
        c2.move();
        //这里能运行是因为a2底层是一个Cat对象，存在catchMouse方法，
        //如果换成new Animal()就会报错
        c2.catchMouse();

        Animal a3 = new Bird();
        if (a3 instanceof Cat) {
            Cat c3 = (Cat) a3;
            c3.catchMouse();
        } else if (a3 instanceof Bird) {
            Bird b1 = (Bird) a3;
            b1.fly();
        }
    }

}
