package Package16;

import java.util.Arrays;

public class BubbleSort {
    //从大到小
    /*
        思想：
        每次从数组第一个元素开始，和右边的元素比较，
        如果是从大到小，则判断，
        如果 左边的元素小于右边的元素 ，则交换位置
        每次循环后，右边元素为最小值，然后循环元素数量减一继续循环直到结束
     */
    public static void main(String[] args) {
        int[] ints = {-1, 2, 10, 100, -20};
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] < ints[j + 1]) {
                    int temp = ints[j + 1];
                    ints[j + 1] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
