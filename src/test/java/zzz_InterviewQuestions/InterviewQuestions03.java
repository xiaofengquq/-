package zzz_InterviewQuestions;
public class InterviewQuestions03 {
    public static void main(String[] args) {
        /*
            面试题3：String为什么是不可变的？（String类底层从Java9开始变为byte数组）
                源代码中，String类里有一个char数组，该数组是个常量（采用fina修饰），
                因为数组一旦被创建长度不可变，且被final修饰的引用一旦指向某个对象后，不可在指向其他对象，
                所以String是不可变的
        */
    }
}
