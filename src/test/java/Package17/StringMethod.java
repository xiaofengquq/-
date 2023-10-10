package Package17;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        //String类当中常用方法
        //  1(掌握)、
        //      char charAt(int index)

        //      123是一个字符串对象，只要是对象，就能用"."来调用方法
        //      charAt是找出一个字符串中，下标为index的字符是什么
        System.out.println("1、 \"123\".charAt(2) 运行的结果为 " + "123".charAt(2));//输出结果：3

        //  2(了解)、
        //      int compareTo(String anotherString)
        System.out.println("2-1、 \"123\".compareTo(\"123\") 运行的结果为 " + "123".compareTo("123"));//相等返回0，如果此字符串在字典顺序上小于字符串参数，则为小于0的值
        //  如果此字符串在字典顺序上大于字符串参数，则为大于0的值。
        //  此方法的比较是从左到右比较，如果第一个字符相等就会继续比较右边的字符，直到有一组字符不相等，输出结果
        System.out.println("2-2、 \"123\".compareTo(\"125\") 运行的结果为 " + "123".compareTo("125"));//输出结果：-2
        System.out.println("2-3、 \"123\".compareTo(\"122\" 运行的结果为 " + "123".compareTo("122"));//输出结果：1

        //  3(掌握)、
        //      boolean contains(CharSequence s)
        //  判断前面的字符串是否包含后面的字符串
        System.out.println("3、 \"123\".contains(\"12\") 运行的结果为 " + "123".contains("12"));

        //  4(掌握)、
        //      boolean endsWith(String suffix)
        //  判断前面的字符串是否以传参字符串结尾
        System.out.println("4、 \"text.txt\".endsWith(\"java\") 运行的结果为 " + "text.txt".endsWith("java"));

        //  5(掌握)、
        //      int length()
        //  面试题：判断数组长度和判断字符串长度不一样
        //  数组长度length是属性，判断字符串长度是length()
        System.out.println("5、 \"text.txt\".length() 运行的结果为 " + "text.txt".length());

        //  6(掌握)、
        //      int indexOf(String str)
        //  获取某个字符串在当前字符串中第一次出现的索引
        System.out.println("6、 \"text.txt\".indexOf(\".\") 运行的结果为 " + "text.txt".indexOf("."));

        //  7(掌握)、
        //      int lastIndexOf(String str)
        //  获取某个字符串在当前字符串中最后一次出现的索引
        System.out.println("7、 \"text.txt\".lastIndexOf(\"t\") 运行的结果为 " + "text.txt".lastIndexOf("t"));

        //  8(掌握)、
        //      String replace(CharSequence target, CharSequence replacement)
        //  String的父接口就是CharSequence
        //  将target变量表示文本 替换为 replacement变量表示文本
        System.out.println("8、 \"http://www.baidu.com\".replace(\"http:\", \"https:\") 运行的结果为 " +
                "http://www.baidu.com".replace("http:", "https:"));

        //  9(掌握)、
        //      String[] split(String regex, int limit)
        //  以regex字符将字符串拆分，返回String数组
        System.out.println("9、 \"2023-4-11\".split(\".\") 运行的结果为 " + Arrays.toString("2023-4-11".split("-")));

        //  10(掌握)、
        //      boolean startsWith(String prefix)
        //  判断某个字符串是否以某个子字符串开始
        System.out.println("10-1、 \"http://www.baidu.com\".startsWith(\"https:\") 运行的结果为 " +
                "http://www.baidu.com".startsWith("https:"));
        System.out.println("10-2、 \"http://www.baidu.com\".startsWith(\"http:\") 运行的结果为 " +
                "http://www.baidu.com".startsWith("http:"));

        //  11(掌握)、
        //      String substring(int beginIndex)
        //  从第beginIndex开始截取字符串
        System.out.println("11、 \"http://www.baidu.com\".substring(7) 运行的结果为 " +
                "http://www.baidu.com".substring(7));

        //  12(掌握)、
        //      String substring(int beginIndex, int endIndex)
        //  从第beginIndex开始截取字符串，截取到endIndex（包括beginIndex，不包括endIndex）
        System.out.println("12、 \"http://www.baidu.com\".substring(7, 10) 运行的结果为 " +
                "http://www.baidu.com".substring(7, 10));//返回下标7到下标10之间的字符串

        //  13(掌握)、
        //      char[] toCharArray()
        //  将字符串转化为char数组
        System.out.println("13、 \"http://www.baidu.com\".toCharArray() 运行的结果为 " +
                Arrays.toString("http://www.baidu.com".toCharArray()));

        //  14(掌握)、
        //      String toLowerCase()
        //  转换为小写
        System.out.println("14、 \"ABCdEFg\".toLowerCase() 运行的结果为 " + "ABCdEFg".toLowerCase());

        //  15(掌握)、
        //      String toUpperCase()()
        //  转换为大写
        System.out.println("15、 \"abcdEfG\".toLowerCase() 运行的结果为 " + "abcdEfG".toUpperCase());

        //  16(掌握)、
        //      String trim()
        //  去除字符串前后空白
        System.out.println("16、 \"          abc dE fG         \".trim() 运行的结果为 " +
                "          abc dE fG         ".trim());

        //  16(掌握)、
        //      String.valueOf(可以传Object)
        //  String中唯一一个静态方法，将非字符串转为String
        System.out.println("17、 String.valueOf(3.14) 运行的结果为 " + String.valueOf(3.14));

    }
}
