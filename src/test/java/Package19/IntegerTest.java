package Package19;

public class IntegerTest {
    /*
        1、java为8种基本数据类型有对应准备了8种包装类型。这8种包装类型都属于引用数据类型，父类是Object
        2、思考：为什么需要再提供8种包装类呢？
     */
    public static void main(String[] args) {
        //  如果有一种需求，需要在doSome()中传递int，但是由于int是基本数据类型，因此无法传递
        //  这样就需要传递int类型的包装类型进去
        Integer integer = 100;
        doSome(integer);
        System.out.println("byte最大值: " + Byte.MAX_VALUE);
        System.out.println("byte最小值: " + Byte.MIN_VALUE + "\n");
        System.out.println("short最大值: " + Short.MAX_VALUE);
        System.out.println("short最小值: " + Short.MIN_VALUE + "\n");
        System.out.println("int最大值: " + Integer.MAX_VALUE);
        System.out.println("int最小值: " + Integer.MIN_VALUE + "\n");
        System.out.println("long最大值: " + Long.MAX_VALUE);
        System.out.println("long最小值: " + Long.MIN_VALUE + "\n");
        System.out.println("float最大值: " + Float.MAX_VALUE);
        System.out.println("float最小值: " + Float.MIN_VALUE + "\n");
        System.out.println("double最大值: " + Double.MAX_VALUE);
        System.out.println("double最小值: " + Double.MIN_VALUE);
    }

    private static void doSome(Object object) {
        System.out.println(object);
    }
}
