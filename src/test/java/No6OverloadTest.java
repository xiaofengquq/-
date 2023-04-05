public class No6OverloadTest {
    /**
     * 回顾java语言当中方法的重载:
     *      1、方法重载又称为overload
     *
     *      2、方法重载什么时候使用?
     *          当在同一个类当中，方法完成的功能是相似的，建议方法名相同，这样方便程序员的编程，就像在调用一个方法似的。代码美观。
     *
     *      3、什么条件满足之后构成方法重载?
     *          -在同一个类当中
     *          -方法名相同
     *          -参数列表不同:类型、顺序、个数
     *
     *      4、方法重载和什么无关?
     *          和方法的返回值类型无关
     *          和方法的修饰符列表无关
     *
     * 关于java语言当中方法的覆盖:
     *      1、方法覆盖又被称为方法重写，英语单词:override[官方的] /overwrite
     *
     *      2、什么时候使用方法重写?
     *          当父类中的方法已经无法满足当前子类的业务需求子类有必要将父类中继承过来的方法进行重新编写，这个重新编写的过程称为方法重写/方法覆盖。
     *
     *      3、什么条件满足之后方法会发生重写呢?《代码满足什么条件之后，就构成方法的覆盖呢?]
     *          *方法重写发生在具有继承关系的父子类之间
     *          *方法重写的时候:返回值类型相同，方法名相同，形参列表相同
     *          *方法重写的时候:访问权限不能更低，可以更高。
     *          *方法重写的时候:抛出异常不能更多，可以更少。[以后讲，讲完异常之后才能解释]
     *
     *      4、建议方法重写的时候尽量复制粘贴，不要编写，容易出错，导致没有产生覆盖。
     *
     *      5、注意:
     *          私有方法不能继承，所以不能覆盖。
     *          构造方法不能继承，所以不能覆盖。
     *          静态方法不存在覆盖。[讲完多态之后解释]
     *          覆盖只针对方法，不谈属性。
     *
     */
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0, 2.9));
        System.out.println(sum(1L, 2L));
        System.out.println(minus(1, 2));
        ;
    }

    //    需求:
//    请定义并实现一个方法，该方法可以计算两个int类型数据的商，要求将最终的计算结果返回给调用者。
    public static int minus(int a, int b) {
        return a - b;
    }

    //    定义一个方法，可以计算两个int类型数据的和
    public static int sumInt(int a, int b) {
        return a + b;
    }

    //    定义一个方法，可以计算两个double类型数据的和
    public static double sumDouble(double a, double b) {
        return a + b;
    }

    //    定义一个方法，可以计算两个long类型数据的和
    public static long sumLong(long a, long b) {
        return a + b;
    }

    //---------------------------------------------
    //    方法重载，相同方法名不同参数，可以将功能相似的方法合并
//    不同类型参数，顺序不同也可以构成重载（例如方法包含两个参数，int和double
//    int + double为一个方法，double + int为另一个方法
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }

}
