package Package25;

import java.util.*;

/*
    Vector:
        1、底层也是一个数组
        2、初始化容量：10
        3、怎么扩容的？
            扩容之后是原容量的2倍。
                10 --> 20 --> 40 --> 80
        4、ArrayList集合扩容特点：
            扩容之后是原容量的1.5倍。
                10 --> 15 --> 15 * 1.5
        5、Vector中所有方法都是线程同步的，都带有synchronized关键字
            是线程安全的。效率比较低，使用较少
        6、怎么将一个线程不安全的ArrayList集合转换成线程安全的呢？
            使用集合工具类
                java.util.Collections;

                java.util.Collection    是集合接口。
                java.util.Collections    是集合工具类。
 */
public class VectorTest {
    public static void main(String[] args) {
        List vector = new Vector();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //  这个以后可能要使用！！
        List myList = new ArrayList();
        //  变成线程安全的
        Collections.synchronizedList(myList);

        myList.add(111);
        myList.add(222);
        myList.add(333);
    }
}
