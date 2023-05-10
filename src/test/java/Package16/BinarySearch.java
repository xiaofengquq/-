package Package16;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {-1, -10, 2, 3, -100};
        int target = -10;
        int result = search(ints, target);
        System.out.println(-1 == result ? "该数组中不存在" + target : "数组中存在" + target + "，下标为" + result);
    }

    //二分法查找
    public static int search(int[] ints, int target) {
        Arrays.sort(ints);
        //起始索引为0，结束索引为数组长度 减一 ，加起来除以二得到中间索引
        int startIndex = 0;
        int endIndex = ints[ints.length - 1];
        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            //每次用中间索引去和目标比对，
            //目标比中间索引大，则起始索引等于中间索引 + 1
            //目标比中间索引大，则结束索引等于中间索引 - 1
            if (target == ints[midIndex]) {
                return midIndex;
            }
            if (target > ints[midIndex]) {
                startIndex = midIndex + 1;
            }
            if (target < ints[midIndex]) {
                endIndex = midIndex - 1;
            }
        }
        return -1;
    }
}
