package Package18;

public class StringBufferTest01 {
    //  如何优化StringBuffer的性能？
    //      在创建StringBuffer对象的时候给一个初始化容量。
    //      最好减少底层数组的扩容次数。预估计一下，给一个大点的初始化容量

    public static void main(String[] args) {
        //StringBuffer是Java中的一个可变字符串类，它可以用于创建和操作字符串，
        //      与String类相比，StringBuffer的最大优势在于可以修改字符串，而不需要创建新的字符串对象。
        //      这使得StringBuffer非常适合在需要频繁修改字符串的情况下使用，例如在字符串拼接和替换等场景下。
        //  创建一个初始化容量为16的char[]数组（jdk8及以下是char[]，9及以上为byte[])
        StringBuffer stringBuffer = new StringBuffer();

        //  拼接字符串，以后拼接字符串统一调用append()
        //  append是追加的意思
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append(true);
        //  append()在进行追加的时候，如果char[]满了，会自动扩容
        stringBuffer.append(100L);
        //  输出引用自动调用toString()
        System.out.println(stringBuffer);// abctrue100
    }
}
