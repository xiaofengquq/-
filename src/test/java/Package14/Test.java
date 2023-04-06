package Package14;

/**
 * 匿名内部类：
 * 1、什么是内部类?
 *      内部类:在类的内部又定义了一个新的类。被称为内部类。
 * 2、内部类的分类:
 *      静态内都类: 类似于静态变量
 *      实例内部类: 类似于实例变量
 *      局部内部类: 类似于局部变量
 * 3、使用内部类编写的代码，可读性很差。能不用尽量不用。
 *
 * 4、匿名内都类是局部内都类的一种。
 *      因为这个类没有名字而得名，叫做匿名内部类。
 *
 * 5、学习匿名内部类主要是让大家以后在阅读别人代码的时候，能够理解。
 *      并不代表以后都要这样写。
 *      因为匿名内部类有两个缺点:
 *          缺点1: 太复杂，太乱，可读性差。
 *          缺点2:类没有名字，以后想重复使用，不能用。
 * */
public class Test {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        myMath.mySum(new Calculate1(), 100, 200);
        //使用匿名内部类，表示Calculate1这个类没有名字了
        //这里表面看上去好像是接口可以直接new了，实际上并不是
        //后面的{}代表了对接口的实现
        myMath.mySum(new Calculate() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        }, 100, 200);
    }

    //使用内部类编写的代码可读性太差，能不用尽量不用

    //这些类在类的内部，所以叫做内部类
    //静态内部类
    static class inner1 {

    }

    //实例内部类
    class inner2 {

    }

    public void doSome() {
        int i = 1;
        //此类出现在方法中，和方法中的局部变量类似，因此叫做局部内部类
        class inner3 {

        }
    }
}
