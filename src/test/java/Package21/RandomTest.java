package Package21;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        int r1 = new Random().nextInt();//  在int范围内随机生成一个数字
        System.out.println(r1);

        //  在[0-100]范围内随机生成一个数字
        //  不包括101，nextInt，下一个Int类型的数据是101，表示只能取到100
        int r2 = new Random().nextInt(101);
        System.out.println(r2);
    }
}
