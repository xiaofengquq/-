package Homework;

import java.util.Arrays;
import java.util.Random;

public class RandomTest01 {
    //  生成5个不同的随机整数（0-5之间，包含0和5），并存入一个数组中返回
    //      by舒心
    public static void main(String[] args) {
        int[] nums = new int[6];

        for (int i = 0; i < 6; i++) {
            nums[i] = i;
        }
        Random random = new Random();
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            //  int a = random.nextInt(nums.length - i) 是用于从 nums 数组中选择随机数的核心代码。
            //      nextInt(int n) 方法返回一个大于等于 0 且小于 n 的随机整数。
            //      在这里，n 是 nums 数组中剩余元素的数量，也就是 nums.length - i。
            //      因此，第一次迭代时，从[0, 1, 2, 3, 4, 5]中取元素，假设取到的元素是0，
            //      那么就将0与nums剩余元素数量（当前是6）作为下标的元素交换位置，
            //      nums就变为了[5, 1, 2, 3, 4, 0]，下次只会从前5个元素中取元素，以此类推
            int index = random.nextInt(nums.length - i);
            result[i] = nums[index];
            int temp = nums[index];
            nums[index] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(result));
    }
}
