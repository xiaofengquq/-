package Package16;

import java.util.Arrays;

public class SelectSort {
    //从小到大
    /*
        思想：
        每次从数组第一个元素开始，和变量max作为下标的元素作比较（max默认为0），
        如果ints[max] < ints[j]，则将max变为j，
        循环一遍以后，将max和j作为下标的元素互换
        每次循环后，右边元素为最大值，
        然后循环元素数量减一继续循环直到结束
     */
    public static void main(String[] args) {
        int[] ints = {-1, 2, 10, 100, -20};
        for (int i = 0; i < ints.length - 1; i++) {
            int max = 0;
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[max]) {
                    max = j;
                }
            }
            int temp = ints[max];
            ints[max] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(ints));
    }
}
