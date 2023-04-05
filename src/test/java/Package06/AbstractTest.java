package Package06;
/**
 *类到对象是实例化。对象到类是 抽象。
 * 抽象类:
 * 1、什么是 抽象类?
 *      类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类。
 *      类本身是不存在的，所以抽象类无法创建对象【无法实例化】
 *
 * 2、抽象类属于什么类型?
 *      抽象类也属于引用数据类型。
 *
 * 3、抽象类怎么定义?《把基础语法先学会》
 *      语法:
 *      [修饰符列表] abstract class 类名{
 *          类体
 *      };
 *
 * 4、抽象类是无法实例化的，无法创建对象的，所以
 * 【抽象类只能用来被子类继承】 ！！！
 *
 * 5、final和abstract不能联合使用，这两个关键字是对立的。
 *
 * 6、抽象类的子类可以是抽象类
 *
 * 7、抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的。
 *
 * 8、抽象类关联到一个概念：抽象方法。
 *      抽象方法表示没有实现的方法，没有方法体的方法。
 *      例如：
 *          public abstract void doSome();
 *      特点是：
 *          1、没有方法体，以分号结尾。
 *          2、前面修饰符列表中有abstract关键字
 *
 * 9、抽象类中不一定有抽象方法，但是抽象方法只能出现在抽象类中
 *
 * 10、
 * */
public class AbstractTest {
    public static void main(String[] args) {
        new CreditAccount("123");
    }
}

//银行账户类(抽象类)
abstract class Account {
    private static native void registerNatives();

    public Account(String s) {
        System.out.println("Account类的有参构造执行");
    }
}

//
class CreditAccount extends Account {
    public CreditAccount(String s) {
        super("213");
        System.out.println("CreditAccount类的有参构造执行");
    }
/*    一个类中没有无参构造方法时，系统会默认创建一个无参构造方法，
    这个无参构造方法有且只有一句代码: super()，会调用父类的无参构造方法
    但是由于继承的父类Account中，没有无参构造方法，因此会报错。*/
//    public CreditAccount() {
//    }
}