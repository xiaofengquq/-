package Package18;

public class StringBuilderTest {

    //  StringBuilder和StringBuffer的区别
    //      StringBuffer中的方法都有：synchronized关键字修饰，表示StringBuffer在多线程环境下运行是安全的
    //      StringBuilder中的方法都没有：synchronized关键字修饰，因此是非线程安全的
    //
    //      StringBuffer：线程安全
    //      StringBuilder：非线程安全
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("a");
        builder.append("b");
        builder.append("c");
        builder.append(true);
        builder.append(100L);
        System.out.println(builder);// abctrue100
    }
}
