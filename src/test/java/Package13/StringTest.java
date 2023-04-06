package Package13;

public class StringTest {
    public static void main(String[] args) {
        String str = "123";
        //String类重写了equals方法，比较两个字符串不能用==
        System.out.println(str.equals(new String("123")));
        //结果为true，由于Object类中的equals方法比较的是两个对象的内存地址，因此可以判断String类重写了equals()方法
        System.out.println(str.toString());//输出结果不是内存地址，因此String类也重写了toString()方法
    }

    /**
     * 大结论：
     *      java中基础数据类型使用 == 来判断是否相等
     *      java中只要是引用就需要使用equals()方法（需要重写）来判断是否相等
     * */
}
