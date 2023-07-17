package Package24.Map;

import java.util.HashMap;
import java.util.Map;

/*
    1、向Map集合中存取元素，都是先调用key的hashCode()方法，然后再调用equals()方法
    equals()方法有可能调用，也有可能不调用

    拿put(k, v)举例，什么时候equals()方法不会调用？
        k.hashCode()方法返回hash值，
        hash值经过哈希算法转换成数组下标。
        数组下标位置上如果是null，equals不需要执行。

    拿get(k)举例，什么时候equals()方法不会调用？
        如果哈希算法转换成的数组下标，该下标位置单向链表为空，那么此时不需要调用equals方法

    2、注意：如果一个类的equals()方法重写了，那么hashCode()方法必须重写。
        并且equals()方法返回true表示两个对象相同，在同一个单向链表上比较。
        那么对于同一个单向链表上的节点来说，他们的哈希值都是相同的。
        所以hashCode()方法返回值也应该相同
    3、hashCode()方法和equals()方法不用研究了，直接用IDEA生成，但是需要同时生成

    4、终极结论：
        放在HashMap集合key部分、以及放在HashSet集合中的元素，需要同时重写equals()方法和hashCode()方法

    5、对于哈希表数据结构而言：
        如果o1和o2的hash值相同，一定是放在同一个单向链表（桶）上。
        如果o1和o2的hash不同，由于哈希算法执行结束后的数组下标可能会相同，因此会发生“哈希碰撞”
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //  Student没有重写equals()方法，会导致无法正确判断相同元素保证map中的key不重复
        Student s1 = new Student("小风");
        Student s2 = new Student("小风");

        Map<Student, String> map1 = new HashMap<>();
        map1.put(s1, "1");
        map1.put(s2, "1");

        System.out.println("s1的hashCode = " + s1.hashCode());// 1627674070
        System.out.println("s2的hashCode = " + s2.hashCode());// 1360875712  未重写hashCode()方法时，相同对象hash值不相同

        for (Map.Entry<Student, String> entry : map1.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        System.out.println("-------------------------------------");

        //  Teacher重写了equals()方法，可以正确判断相同元素以保证map中的key不重复
        Teacher t1 = new Teacher("小风");
        Teacher t2 = new Teacher("小风");

        Map<Teacher, String> map2 = new HashMap<>();
        map2.put(t1, "1");
        map2.put(t2, "2");

        System.out.println("t1的hashCode = " + t1.hashCode());// 重写hashCode()后   769726
        System.out.println("t2的hashCode = " + t2.hashCode());// 769726

        for (Map.Entry<Teacher, String> entry : map2.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
