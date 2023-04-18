package Package19;

/*
    jdk1.5后，支持自动装箱和自动拆箱
     */
public class WrapperClassTest01 {
    public static void main(String[] args) {
        //自动装箱（将基本数据类型直接赋值给包装类型）
        Integer integer = 100;
        //自动拆箱（将包装类型直接赋值给基本数据类型）
        int i = integer;
    }
}
