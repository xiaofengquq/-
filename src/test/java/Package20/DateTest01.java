package Package20;

/*
    简单总结System类的相关属性和方法：
        System.out  【out是System类的一个静态变量，类型为PrintStream】
        System.out.println()是PrintStream类中的方法
        System.currentTimeMillis()  获取自1970年1月1日 00:00:00 000到当前系统时间的毫秒数
 */
public class DateTest01 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        print();
        long endTime = System.currentTimeMillis();
        System.out.println("方法运行时间：" + (endTime - startTime) + "ms");
    }

    //  需求，统计一个方法执行耗费的时间
    public static void print() {
        for (long i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
