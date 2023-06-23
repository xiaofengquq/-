package Package24;

/*
    JDK5.0之后推出了一个新特性，叫做增强for循环，或者for each
 */
public class ForEachTest {
    public static void main(String[] args) {
        //  int类型数组
        int[] arr = new int[]{123, 1231, 5231, 456};
        //  增强for循环
        //  有个缺点：不能计数（没有下标）
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
