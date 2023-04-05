package Package02;

/** 关于java语言当中的继承:
 *      1、继承是面向对象三大特征之一，三大特征分别是: 封装、继承、多态
 *
 *      2、继承"基本”的作用是:代码复用。但是继承最"重要"的作用是:有了继承才有了以后"方法的要盖"和"多态机制”
 *
 *      3、继承语法格式:
 *          [修饰符列表] class 类名 extends 父类名{
 *              类体 = 属性 + 方法
 *              }
 *
 *      4、java语言当中的继承只支持单继承，一个类不能同时维承很多类，只能继承一个类。在C++中支持多继承。
 *
 *      5、关于继承中的一些术语:
 *          B类继承A类，其中:
 *              A类称为:父类、基类、超类、superclass
 *              B类称为:子类、派生类、subclass
 *
 *      6、在java语言当中子类维承父类都继承哪些数据呢?
 *          -私有的不支持继承 !!!
 *          -构造方法不支持继承
 *          -其它数据都可以被继承
 *
 *      7、java语言中假设一个类没有显示的维承任何类，该类野认继承JavaSE库当中提供的java.lang.Object类。
 *
 */


public class ExtendsTest {
    public static void main(String[] args) {
        CreditAccount act = new CreditAccount();
        act.setActNo("act-001");
        act.setBalance(-1000.0);
        act.setCredit(0.99);

        System.out.println(act.getActNo() + ", " + act.getBalance() + ", "
            + act.getCredit());
    }
}
