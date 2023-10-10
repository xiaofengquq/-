package Package21;

import java.math.BigDecimal;

/*
    BigDecimal属于大数据，精度极高，不属于基本数据类型，属于引用数据类型
    它由 SUN 公司提供，通常用于在软件开发中进行高精度数值计算

    注意：财务软件中double是不够的，需要使用BigDecimal
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("190.0123456789");
        BigDecimal b2 = new BigDecimal("200.0");
        System.out.println("使用BigDecimal计算 190.0123456789 + 200.0 = " + b2.add(b1)); //  调用方法求和

        double d1 = 190.0123456789;
        double d2 = 200.0;
        System.out.println("使用double计算 190.0123456789 + 200.0 = " + (d1 + d2));

        float f1 = 190.0123456789F;
        float f2 = 200.0F;
        System.out.println("使用float计算 190.0123456789 + 200.0 = " + (f1 + f2));
    }
}
