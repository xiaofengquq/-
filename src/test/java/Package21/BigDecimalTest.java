package Package21;

import java.math.BigDecimal;

/*
    BigDecimal属于大数据，精度极高，不属于基本数据类型，属于引用数据类型
    这是SUN公司提供的类，专门用于参悟软件当中

    注意：财务软件中double是不够的，需要使用BigDecimal
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("190.0");
        BigDecimal b2 = new BigDecimal("200.0");
        System.out.println(b2.add(b1));//   调用方法求和
    }
}
