package Homework;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {

    /*
        需求：编写代码，生成一个数组，包含五个随机数，这五个随机数不能相同
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateFiveRandomNumbers()));
    }

    /**
     * 生成5个不同的随机整数（0-5之间，包含0和5），并存入一个数组中返回
     *
     * @return 由5个不同随机整数组成的数组
     */
    public static int[] generateFiveRandomNumbers() {
        // 创建Random对象
        Random random = new Random();

        // 初始化计数器i和保存随机数的数组
        int i = 0;
        int[] ints = new int[5];

        // 不断生成随机数，直到生成5个不同的数为止
        while (i != 5) {
            // 标记是否重复
            boolean isRepeat = false;
            // 生成随机数
            int r = random.nextInt(6);
            // 遍历数组，查找是否已经有相同的数
            for (int j = 0; j < 5; j++) {
                if (ints[j] == r) {
                    isRepeat = true;
                    break;
                }
            }
            // 如果没有相同的数，将随机数加入数组
            if (!isRepeat) {
                ints[i] = r;
                i++;
            }
        }
        return ints;
    }
}
