package Package24.Collection.List;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
    List接口：
        1、List集合存储元素特点：有序可重复
            有序：List集合中的元素有下标
                从0开始，以1递增
            可重复：存储一个1，还能存储第二个1
        2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
            void add(int index, E element);//   在指定位置（index）处插入元素（E element）
                //  此方法使用频率较低，因为vector底层是个数组，插入效率很低
            E get(int index);// 获取指定位置（index）处的元素
            int indexOf(Object o);//    返回此集合中指定元素 第一次 出现的索引，如果此列表不包含该元素，则返回 -1
            int lastIndexOf(Object o);//   返回此集合中指定元素 最后一次 出现的索引，如果此列表不包含该元素，则返回 -1
            E set(int index, E element);//  更改集合指定索引处的元素
 */
public class ListTest {
    public static void main(String[] args) {
        //  创建List类型的集合
        List myList = new Vector();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add(2, "FFF");//    在 B 和 C 中间插入 FFF
        myList.add("B");
        myList.set(4, "zzz");// 将myList集合中索引为4的元素修改为zzz

        //  迭代
        Iterator it = myList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("myList集合索引为" + 0 + "处的元素为" + myList.get(0));

        System.out.println("myList集合中B的索引为 " + myList.indexOf("B"));
        System.out.println("myList集合中B最后一次出现的索引为 " + myList.lastIndexOf("B"));
    }
}
