package Package15;


import java.util.Arrays;


public class ArrayTest03 {
    public static void main(String[] args) {
        //java中数组长度不可变，因此想要实现数组的扩容，需要先创建一个大数组，再将小数组copy到大数组中
        int[] ints = new int[]{1, 2, 3};
        int[] largeInts = new int[] {4, 5, 6, 7, 8};
        //arraycopy()方法中的length参数指的是从原数组中拷贝的长度
        //因此该值不能大于原数组的length
        //  从ints中下标为0处开始，拷贝到largeInts下标为1处，拷贝长度为3,
        System.arraycopy(ints, 0, largeInts , 1, 3);
        System.out.println(Arrays.toString(largeInts)); //  [4, 1, 2, 3, 8]
/*
    结论:数组扩容效率较低。因为涉及到拷贝的问题。
    所以在以后的开发中请注意:尽可能少的进行数组的拷贝，可以在创建数组对象的时候预估计一下多长合适，最好预估准确，
    这样可以减少数组的扩容次数。提高效率。
 */
    }
}
