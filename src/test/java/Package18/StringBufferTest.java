package Package18;

public class StringBufferTest {
    //由于字符串是不可变的，所以每一次拼接字符串都会产生新字符串。
    //这样会占用大量方法区内存，造成内存空间浪费
    public static void main(String[] args) {
        String s ="";
        for (int i = 0; i < 99999; i++) {
            s += i;
            System.out.println(s);
        }
    }
}
