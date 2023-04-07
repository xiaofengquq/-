public class InterviewQuestions {
    public static void main(String[] args) {
        /*
            面试题1：java语言中凡是没有方法体的方法都是抽象方法
                错误
            Object类中有很多方法都没有方法体，native关键字修饰，调用底层C++代码
        */
        /*
            面试题2：分析一下代码一共创建了几个对象
                2个
            在方法区常量池中的"123"并不会被当作一个新的对象创建，因为它是常量池中的一个常量，只有一个实例，可以被多个字符串引用共享。
            所以在这段代码中，一共创建了两个字符串对象：s1 和 s2
         */
        String s1 = new String("123");
        String s2 = new String("123");
    }
}
