public class Test {
    public static void main(String[] args) {
        BooleanTest(false, true);
    }

    public static void BooleanTest(boolean x, boolean y) {
        if (x | y) {
            System.out.println("x 和 y 都为 true");
        } else {
            System.out.println("x 和 y 不都为 true");
        }
    }
}
