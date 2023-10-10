package Package22;

/*/
    采用枚举的方式改造程序
        如果一个方法的返回值 等于 两种，建议使用布尔类型
        如果一个方法的返回值 大于 两种，建议使用枚举类型

    枚举常量是枚举类型的实例
    但它们的创建方式与普通类的实例化方式不同。
    它们在定义枚举类型时就已经存在，并且可以像其他实例一样使用。
 */
public class EnumTest01 {
    public static void main(String[] args) {
        Result r = divide(10, 0);
        System.out.println(r == Result.SUCCESS ? "计算成功" : "计算失败");
    }

    /**
     * 以下程序，计算两个int类型数据的商，计算成功返回1，计算失败返回0（这个案例没有使用枚举）
     * @param a  int类型的数据
     * @param b  int类型的数据
     * @return 返回Result.SUCCESS表示成功，返回Result.FAIL表示失败
     * */
    public static Result divide(int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e) {
            return Result.FAIL;
        }
    }
}

//  枚举：一枚一枚可以列举出来的，才建议使用枚举类型
//  枚举编译后也是生成class文件。
//  枚举也是一种引用数据类型
//  枚举中的每一个值可以看做是常量
enum Result {
    //  SUCCESS是枚举Result中的一个值
    //  FAIL也是枚举Result中的一个值
    SUCCESS,FAIL
}
