package Package24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    ArrayList集合：
        1、默认初始化容量10
        2、集合底层是一个Object数组
        3、构造方法
            new ArrayList();
            new ArrayList(20);
        4、ArrayList集合的扩容：
            原容量的1.5倍
            ArrayList集合底层是数组，怎么优化？
                尽可能少的扩容，因为数组扩容效率较低
                应该在使用ArrayList之前预估元素个数，给定一个初始化容量
        5、数组优点：
            检索效率比较高（每个元素占用空间大小相同，内存地址是连续的，知道首元素内存地址，
            然后知道下标，通过数学表达式就可以计算出目标元素的内存地址，所有检索效率最高）
        6、数组缺点：
            随机增删元素效率较低。
            数组无法存储大数据量。（很难找到一块非常巨大的、连续的内存空间）
        7、向数组末尾添加元素，效率很高，不收影响。
        8、面试官经常问的一个问题：
            这么多集合中，你用哪个集合最多？
                答：ArrayList集合。
                因为往数组末尾添加元素，效率不受影响。
                另外，检索/查找某个元素的操作比较少

 */
public class ArrayListTest {
    public static void main(String[] args) {
        //  默认初始化容量为10
        List list = new ArrayList();

        //  集合的size()方法是获取集合中 元素 的个数，不是获取集合的容量
        System.out.println(list.size());//  0

        //  指定初始化容量为20
        List list1 = new ArrayList(20);
    }
}
