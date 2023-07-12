package Package24.Map;

import java.util.HashMap;
import java.util.Map;

/*
    HashMap集合：
        1、HashMap底层是哈希表/数列表的数据结构
        2、哈希表是一个怎样的数据结构呢？
            哈希表是一个数组和单向链表的结合体。
            数组：在查询方面效率很高，但是在随机增删方面效率很低
            单向链表：在随机增删方面效率较高，在查询方面效率很低
            哈希表将以上两种数据结构融合在一起，充分发挥它们各自的优点
        3、HashMap底层的源代码：
            public class HashMap<K,V> {

                //  HashMap底层实际上就是一个数组（一维数组）
                transient Node<K,V>[] table;

                //  静态的内部类HashMap.Node
                static class Node<K,V> implements Map.Entry<K,V> {
                    final int hash;//   哈希值（哈希值是key的HashCode()方法的执行结果。
                                        Hash值通过哈希函数/算法，可以转换存储成数组的下标。）
                    final K key;//  存储到Map集合中的key
                    V value;//  存储到Map集合中的value
                    Node<K,V> next;//   下一个节点的内存地址
                }
            }
            哈希表/数列表：一维数组，这个数组中的每一个元素是一个单向链表。（数组和链表的结合体）
        4、主要掌握的是：
            public V put(K key, V value)
            public V get(Object key)
        5、HashMap集合的key部分特点：
            无序，不可重复。
            为什么无序？
                因为不一定挂在哪一个单向链表上
            不可重复是怎么保证的？
                equals方法来保证HashMap集合的key不可重复。
            如果key重复了，value会覆盖

            放在HashMap集合key部分的元素其实就是放到HashSet集合中了。
            所以HashSet集合中的元素也需要重写hashCode() + equals()方法
        6、哈希表HashMap使用不当时无法发挥性能！
            假设将所有的HashCode()方法返回值固定为某个值，那么会导致底层哈希表变成了单向链表
            这种情况我们称为：散列分布不均匀
            什么是散列分布均匀呢？
                假设有100个元素，10个单向链表，那么每个单向链表上有10个节点，这是最好的
            假设将所有的hashCode()方法返回值都设定为不一样的值，可以吗？
                不行，这样的话底层哈希表就变成一维数组了，没有链表的概念了。
                也是散列分布不均匀。

            散列分布均匀，需要重写hashCode()方法有一定的技巧

        7、重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashCode() + equals()方法
        8、HashMap集合的默认初始化容量是16，默认加载因子是0.75
            这个默认加载因子，是当HashMap集合底层数组的容量打到75%的时候，数组开始扩容。

            重点：记住：HashMap集合初始化容量必须是2的倍数，这也是官方推荐的。
                这是为了达到散列均匀，为了提高HashMap集合的存取效率，所必须的
 */
public class HashMapTest {
    public static void main(String[] args) {
        //  测试HashMap集合key部分元素的特点
        //  Integer是key，它的hashCode和equals()方法都重写了
        Map<Integer, String> map = new HashMap<>();
        map.put(111, "String1");
        map.put(222, "String2");
        map.put(333, "String3");
        map.put(333, "String33");// key重复，value覆盖

        System.out.println(map.size() + "\n");//   3

        //  遍历Map集合
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
            //  key: 333, value: String33
            //  key: 222, value: String2
            //  key: 111, value: String1
            //  验证结果：HashMap集合key部分元素：无序不可重复
        }
    }
}
