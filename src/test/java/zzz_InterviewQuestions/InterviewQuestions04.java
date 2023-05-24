package zzz_InterviewQuestions;
public class InterviewQuestions04 {
    public static void main(String[] args) {
        /*
            面试题4：StringBuilder/StringBuffer为什么是可变的？
                因为StringBuilder/StringBuffer实际上是一个char数组，这个char数组并没有被final修饰，
                StringBuilder/StringBuffer的初始化容量我记得应该是16，当存满以后会进行扩容，
                底层调用了数组拷贝的方法Arrays.copyOf()，因此StringBuilder/StringBuffer适合用于字符串的频繁拼接
        */
    }
}
