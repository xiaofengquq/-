package Package19;

/*
    1、8种基本数据类型对应的包装类是什么？
        基本数据类型	包装类型
           byte	    Byte    (父类Number)
           short	Short   (父类Number)
           int	    Integer (父类Number)
           long	    Long    (父类Number)
           float	Float   (父类Number)
           double	Double  (父类Number)
           char	    Character(父类Object)
           boolean	Boolean (父类Object)
   2、8种包装类中，其中六个都是数字对应的包装类，父类均为Number，可以先研究Number里的公共方法
     */
public class WrapperClassTest {
    public static void main(String[] args) {
        //  100这个基本数据类型，通过构造方法的包装达到了这个目的：
        //      基本数据类型（转化为）- > 引用数据类型（装箱）
        Integer integer = new Integer(100);

        //  引用数据类型（转化为）- > 基本数据类型（拆箱）
        double d = integer.doubleValue();// 这里调用的doubleValue()为Number父类中的
        System.out.println(d);
    }
}
