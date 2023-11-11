package Package27;

/*
    研究一下，Class.forName()发生了什么
        如果只希望一个类的静态代码块执行，不希望这个类中的其它代码执行
        那么可以只用Class.forName("带包名的类名")
        这个方法的执行会导致类加载，类加载时，静态代码块执行
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            //  Class.forName()方法的执行会导致类加载
            Class.forName("Package27.MyClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}