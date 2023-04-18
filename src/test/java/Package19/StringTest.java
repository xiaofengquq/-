package Package19;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("123".charAt(1));//    2
        System.out.println("123".compareTo("113")); //  字典顺序，大于返回1，等于返回0，小于返回-1
                                                    //  1
        System.out.println("123".contains("2"));//  true
        System.out.println("123".endsWith("2"));//  false
        System.out.println("aBc".equalsIgnoreCase("Abc"));//  true
        System.out.println("123321".indexOf("2"));//    1
        System.out.println("123".isEmpty());//    false
        System.out.println("123312".lastIndexOf("2"));//    5
        System.out.println("123".length());//    3
        System.out.println("123333332222200000".replace("3", "9"));     //    129999992222200000
        System.out.println("123333332222200000".replaceFirst("3", "9"));//    129333332222200000
        System.out.println(Arrays.toString("123333332222200000".split("3")));
                                                    //    [12, , , , , , 2222200000]
        System.out.println("123".startsWith("2"));//    false
        System.out.println("123".substring(1));//    23
        System.out.println("123".toString());// 123
        System.out.println("abC".toUpperCase());// ABC
        System.out.println("            123            ".trim());//  123

        String str = String.valueOf(true);
        System.out.println(str);//  true
    }
}
