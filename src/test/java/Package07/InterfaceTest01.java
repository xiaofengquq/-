package Package07;

public class InterfaceTest01 implements MyMath01{
    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    /**
     * 接口:
     * 1、接口也是一种“引用数据类型”。编译之后也是一个class字节码文件。
     *
     * 2、接口是完全抽象的。(抽象类是半抽象。) 或者也可以说接口是特殊的抽象类
     *
     * 3、接口怎么定义，语法是什么?
     *      [修饰符列表] interface 接口名 {
     *
     *      }
     *
     * 4、接口支持多继承，一个接口可以继承多个接口
     *
     * 5、接口中只包含两部分内容，分别是：
     *      常量  和  抽象方法
     *
     * 6、接口中所有元素都是public修饰的
     *
     * 7、接口中所有的方法不能有方法体
     *
     * 8、接口中的常量，public static final可以省略，但是还是不能为其赋值
     * */

    public static void main(String[] args) {
        System.out.println(MyMath01.str);
    }


}

//定义接口
interface A {

}

//接口支持继承
interface B extends A {

}

//接口支持多继承
interface C extends A, B {

}

interface MyMath01 {
    public static final String  str = "String";
    //接口中既然都是抽象方法，那么 public 和 abstract 可以省略
    public abstract int sum(int a, int b);

    int sub(int a, int b);
}