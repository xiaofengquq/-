package Package17;

public class StringTest {
    public static void main(String[] args) {
        //s1和s2在编译期间就已经确定了它们的值，因此它们在内存中的地址是相同的，即它们指向的是同一个对象。
        String s1 = "123";
        String s2 = "123";
        System.out.println(s1 == s2);

        //s3和s4是在运行时动态创建的两个对象，它们的值相同但是地址不同
        String s3 = new String("123");
        String s4 = new String("123");
        System.out.println(s3 == s4);
    }
}
