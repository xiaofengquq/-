
public class No8RecursionTest {

    public static void main(String[] args) {
        System.out.println(sum1(10));
        System.out.println(sum2(10));
        System.out.println(factorial1(5));
        System.out.println(factorial2(5));
    }
    //    不使用递归，计算1~N的和
    public static long sum1(long n) {
        long result = 0;
        if (n == 1) {
            return 1;
        } else {
            for (long i = 1; i <= n; i++) {
                result += i;
            }
        }
        return result;
    }

    //    使用递归，计算1~N的和
    //  n = 4
    //  4 + sum(3)
    //  4 + 3 + sum(2)
    //  4 + 3 + 2 + sum(1)
    //  只需要让sum(1) = 1即可

    public static long sum2(long n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum2(n - 1);
        }
    }

    //    不使用递归，计算N的阶乘
    public static int factorial1(int n) {
        int result = 1;
        if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
    //    使用递归，计算N的阶乘
    public static int factorial2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial2(n - 1);
        }
    }
}
