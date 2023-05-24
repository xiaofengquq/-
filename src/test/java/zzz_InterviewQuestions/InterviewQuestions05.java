package zzz_InterviewQuestions;
public class InterviewQuestions05 {
    public static void main(String[] args) {
        /*
            面试题5：
                m1()方法运行的结果是多少
         */
        System.out.println(m1());// 100

        //  GPT的解释：
        //      在finally块中，变量i的值会自增一次，
        //          但是这个自增操作不会影响到try块中的return语句返回的结果。
        //          因为在return语句执行时，已经将变量i的值保存下来，
        //          然后在finally块中的自增操作对返回结果没有影响。
        //      所以，无论finally块中的自增操作如何改变变量i的值，
        //          方法m1()最终返回的结果始终是初始值100。
    }

    public static int m1() {
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
    }

    /*
        反编译以后的效果
        public static int m1(){
            int i = 100;
            int j = i;
            i++;
            return j;
            Exception exception;
            exception;
            i++;
            throw exception;
        }
    */
}
