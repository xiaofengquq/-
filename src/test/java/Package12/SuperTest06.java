package Package12;
/**
 * 通过这个测试得出的结论：
 *      super不是引用。super也不保存内存地址，super也不指向任何对象。
 *      super只是代表当前对象内部的那一块父类型的特征。
 * */
public class SuperTest06 {
    //实例方法
    public void doSome() {
        //输出引用，会自动输出该引用的 toString()方法
        System.out.println(this);
        //编译报错，需要.
//        System.out.println(super);
    }


    //静态方法，主方法
    public static void main(String[] args) {
        new SuperTest06().doSome();
    }
}
