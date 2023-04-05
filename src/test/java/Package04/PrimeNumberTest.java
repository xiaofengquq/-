package Package04;

public class PrimeNumberTest {
    static int sum = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
