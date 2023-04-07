package Package17;

public class StringConstructionMethod {
    /*
    * 关于String类的构造方法：
    *   1、String s = new String("")
    *   2、String s = ""; 最常用
    *   3、String s = new String(char数组)
    *   4、String s = new String(char数组, 起始下标, 长度)
    *   5、String s = new String(byte数组)
    *   6、String s = new String(byte数组, 起始下标, 长度)
    * */
    public static void main(String[] args) {
        //创建字符串最常用的方式
        String s1 = "s1";
        System.out.println("s1: " + s1);

        /*
            常用的构造方法
         */
        byte[] bytes = {97, 98, 99};
        //这个构造方法的 目的 是将byte数组的全部转化成字符串
        String s2 = new String(bytes);

        //通过输出内容，我们得出一个结论，String类已经重写了toString()，因为输出的不是s2对象的内存地址
        System.out.println("s2: " + s2);//输出结果：abc

        //第一个参数：字节数组，第二个参数：数组元素下标的起始位置，第三个数组：长度
        //这个构造方法的 目的 是将byte数组的一部分转化成字符串
        String s3 = new String(bytes, 1, 2);
        System.out.println("s3: " + s3);//输出结果：bc

        char[] chars = {'1', '2', '3', '4', '5'};
        //这个构造方法的 目的 是将char数组全部转化成字符串
        String s4 = new String(chars);
        System.out.println("s4: " + s4);//输出结果：12345

        char[] chars1 = {'1', '2', '3', '4', '5'};
        //这个构造方法的 目的 是将char数组的一部分转化成字符串
        String s5 = new String(chars, 1, 2);
        System.out.println("s5: " + s5);//输出结果：23
    }
}
