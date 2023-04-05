package Package05;
/**
 * 1、"this."和"super."大部分情况下都可以省略
 * 2、"this."什么时候不能省略?
 *      public void setName(String name) {
 *          this.name = name
 *      }
 * 3、super.什么时候不能省略？
 *      父中有，子中又有，如果想在子中访问"父的特征”，super.不能省略。
 * */
public class SuperTest05 {
    public static void main(String[] args) {
        Vip v = new Vip("张三");
        v.shopping();
    }
}

class Customer {
    String name;

    public Customer(String name) {
        super();
        this.name = name;
    }

    public Customer() {
    }

}

class Vip extends Customer {
    //假设子类中也有一个同名属性
    //java中允许在子类中出现和父类一样的同名变量/同名属性
    String name;

    public Vip(String name) {
        super(name);
//        this.name = null;
//        如果构造方法中没有给实例变量赋值，那么会自动赋值该变量对应变量类型的默认值(String为null,int为0)
    }

    public Vip() {
    }

    public void shopping() {
        System.out.println(this.name + "正在购物");//null正在购物
        System.out.println(super.name + "正在购物");//张三正在购物
        System.out.println(name + "正在购物");//null正在购物
    }
}
