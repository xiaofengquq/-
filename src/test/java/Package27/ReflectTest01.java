package Package27;

/*
    需要操作一个类的字节码，需要先获取到这个类的字节码，怎么获取java.lang.Class实例？
        有三种方式
            1、public static Class<?> forName(String className)
                Class.forName()
            2、public final native Class<?> getClass();
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        Class c1;
        Class c2;
        Class c3;
        /*
            1、静态方法
            2、方法的参数是一个字符串
            3、字符串需要的是一个完整类名
            4、完整类目必须带有包名，比如 java.lang.String
         */
        try {
            c1 = Class.forName("java.lang.String");   //  c1代表String.class，或者说c1代表 String 类型
            c2 = Class.forName("java.util.Date");
            c3 = Class.forName("java.lang.Integer");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        /*
            java中任何一个对象，都有一个方法，getClass()
         */

        Class s = "s".getClass();   //  s代表String.class字节码文件，或者说s代表String类型

        System.out.println("用getClass获取字节码文件 对比 Class.forName()获取字节码文件：" +
                (c1 == s));    //  true，因为字节码文件只会装载一份
    }
}