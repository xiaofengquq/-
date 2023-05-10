package Package22;

/*/
    分析以下程序，在设计上有什么缺陷？
        需求只有两种情况，0和1，应该使用布尔类型作为返回值
 */
public class EnumTest {
    public static void main(String[] args) {

    }

    /**
     * 以下程序，计算两个int类型数据的商，计算成功返回1，计算失败返回0（这个案例没有使用枚举）
     * @param a  int类型的数据
     * @param b  int类型的数据
     * @return 返回1表示成功，返回0表示失败
     * */
    public static int divide(int a, int b) {
        try {
            int c = a / b;
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}

