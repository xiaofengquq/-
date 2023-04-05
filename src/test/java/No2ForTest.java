public class No2ForTest {
    public static void main(String[] args) {
        //九九乘法表
        for (int i = 1; i <= 9; i++) {
            System.out.println("");
            for (int j = 1; j <= 9; j++) {
                if (j > i) {
                    continue;
                }
                System.out.print(i + "*" + j  + "=" + (i * j) + " ");
            }
        }
    }
}
