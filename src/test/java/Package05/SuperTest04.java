package Package05;

public class SuperTest04 {
    //this()和super()都不能出现在静态方法中
    public static void main(String[] args) {
        Vip v = new Vip("张三");
        v.shopping();
    }
}

class Customer01 {
    String name;//张三

    public Customer01() {

    }

    public Customer01(String name) {
//        super();
        this.name = name;
    }
}

class Vip01 extends Customer {
    public Vip01() {

    }

    public Vip01(String name) {
        super(name);
    }

    public void shopping() {
        System.out.println(this.name + "正在购物");//张三在购物
        System.out.println(super.name + "正在购物");//同上
        System.out.println(name + "正在购物");//同上
    }
}

