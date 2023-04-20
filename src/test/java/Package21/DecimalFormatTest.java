package Package21;

import java.text.DecimalFormat;
/*
    关于数字的格式化
 */
public class DecimalFormatTest {
    //  java.text.DecimalFormat专门负责数字格式化
    //  DecimalFormat df = new DecimalFormat("数字格式");
    /*
        数字格式有哪些？
            #   任意数字
            ,   千分位
            .   小数点
            0   不够时补0
     */
    public static void main(String[] args) {
        //  表示加入千分位，保留两位小数
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println(df.format(694793672.605324585));//   694,793,672.61
        DecimalFormat df1 = new DecimalFormat("###,###.0000000000");
        System.out.println(df1.format(694793672.605324585));//   694,793,672.6053246000
    }


}
