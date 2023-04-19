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

        /*
            面试题3：String为什么是不可变的？（String类底层从Java9开始变为byte数组）
                源代码中，String类里有一个char数组，该数组是个常量（采用fina修饰），
                因为数组一旦被创建长度不可变，且被final修饰的引用一旦指向某个对象后，不可在指向其他对象，
                所以String是不可变的
         */

        /*
            面试题4：StringBuilder/StringBuffer为什么是可变的？
                因为StringBuilder/StringBuffer实际上是一个char数组，这个char数组并没有被final修饰，
                StringBuilder/StringBuffer的初始化容量我记得应该是16，当存满以后会进行扩容，
                底层调用了数组拷贝的方法Arrays.copyOf()，因此StringBuilder/StringBuffer适合用于字符串的频繁拼接
         */
    }
}
