package Package24.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

/*
    TreeSet集合存储元素特点：
        1、无序不可重复，但是存储的元素可以按照字典顺序自动排序
            称为：可排序集合

        2、无序：这里的无序指的是存进去的顺序和取出来的顺序不同，并且没有下标
 */
public class TreeSetTest {
    public static void main(String[] args) {
        //  创建集合对象
        Set<String> set = new TreeSet<>();
        //  添加元素
        set.add("123");
        set.add("abc");
        set.add("哈哈哈");
        set.add("@!#$%^&*");
        set.add("");
        //  取出元素并打印
        System.out.println(set);
    }
}
