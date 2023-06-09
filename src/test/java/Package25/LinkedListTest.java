package Package25;

import java.util.LinkedList;
import java.util.List;
/*
    链表的优点:
        由于链表上的元来在空间存储上内存地址不连续。
        所以随机增删元表的时候不会有大量元表位移，因此随机增删效事较高。
        在以后的开发中，如果遇到随机增删集合中元素的业务比较多时，建议使用LinkedList。

    链表的献点:
        不能通过数学表达式计算被查找元表的内存地址，
        每一次查找都是从头节点开始遍历，直到找到为止。
        所以LinkedList集合检索/查找的效率较低。

        ArrayList：把检索发挥到极致。（末尾添加元素效率还是很高的。）
        LinkedList：把随机增删发挥到极致。
            加元素都是往末尾添加，所以ArrayList用的比LinkedList多
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
