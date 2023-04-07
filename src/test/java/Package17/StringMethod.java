package Package17;

public class StringMethod {
    public static void main(String[] args) {
        //String类当中常用方法
        //  1(掌握)、char charAt(int index)
        char c = "123".charAt(2);//123是一个字符串对象，只要是对象，就能.
        System.out.println(c);//输出结果：3

        //  2(了解)、compareTo(String anotherString)
        System.out.println("123".compareTo("123"));//相等返回0，如果此字符串在字典顺序上小于字符串参数，则为小于0的值
                                                   //如果此字符串在字典顺序上大于字符串参数，则为大于0的值。
        //此方法的比较是从左到右比较，如果第一个字符相等就会继续比较右边的字符，直到有一组字符不相等，输出结果
        System.out.println("123".compareTo("124"));//输出结果：-1
        System.out.println("123".compareTo("122"));//输出结果：1
    }


}
