package Package19;

public class IntegerTest01 {
    public static void main(String[] args) {
        //面试题
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);//   true
        //双等号不会触发自动拆箱
        //这是因为 Java 中的 Integer 类使用了整数缓存池（Integer Cache）的机制。在这个缓存池中，
        // Java 会预先创建一些 Integer 对象，其值在 -128 到 127 之间。
        // 当创建一个新的 Integer 对象时，如果该对象的值在这个范围内，
        // 则会从缓存池中直接返回对应的 Integer 对象，而不是重新创建一个新的对象。
        Integer c = 1000;
        Integer d = 1000;
        System.out.println(c == d);//   false
        //由于1000在-128 到 127以外，因此不会触发整数缓存池的机制，因此c与d是两个不同的对象

        //parseDouble()，Double类中的静态方法，用来将String转换为double，
        System.out.println(Double.parseDouble("3.14") + 1);//   4.140000000000001(精度问题)
        //parseInt()，Integer类中的静态方法，用来将String转换为int，
        System.out.println(Integer.parseInt("956"));
        //  如果传参不是一个数字，会抛出异常NumberFormatException
        //  Exception in thread "main" java.lang.NumberFormatException: For input string: "中文"
        System.out.println(Integer.parseInt("中文"));
    }
}
