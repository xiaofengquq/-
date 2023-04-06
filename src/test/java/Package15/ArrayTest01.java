package Package15;

public class ArrayTest01 {
    int[] ints = new int[5];
    int[] ints1 = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {
        if ("yzw".equalsIgnoreCase(args[0]) && "123".equalsIgnoreCase(args[1])) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
