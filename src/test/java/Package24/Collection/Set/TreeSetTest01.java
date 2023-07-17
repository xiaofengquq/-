package Package24.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

/*
    1、TreeSet集合底层实际上是一个TreeMap
    2、TreeMap集合底层是一个二叉树
    3、放到TreeSet集合中的元素，等同于放到了TreeMap集合的key部分
    4、TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序
        称为可排序集合
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("g");
        set.add("d");
        set.add("f");
        set.add("z");
        set.add("a");
        set.add("b");


        for (String s : set) {
            //  按照字母顺序升序
            System.out.println(s);
        }
    }
}
