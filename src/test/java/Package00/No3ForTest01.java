package Package00;

import java.util.ArrayList;
import java.util.List;

public class No3ForTest01 {
    public static void main(String[] args) {
        findPrimeNumber02();
    }

    public static void findPrimeNumber01() {
        /*
        编写for循环找出1~100中所有的素数
        * */
        for (int i = 1; i <= 100; i++) {
            boolean b = true;
            for (int j = 1; j < i; j++) {
                if (j != 1 && i % j == 0) {
                    b = false;
                }
            }
            if (b) {
                System.out.print(i + " ");
            }
        }
    }

    public static void findPrimeNumber02() {
        ArrayList<Integer> list = new ArrayList<>();
//        升级版:编写for循环找出1~10000中所有的素数要求每8个换一行输出
        for (int i = 1; i <= 10000; i++) {
            boolean b = true;
            for (int j = 1; j < i; j++) {
                if (j != 1 && i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                list.add(i);
            }
            if (list.size() == 8) {
                System.out.println(list);
                list.clear();
            }
        }
    }
}
