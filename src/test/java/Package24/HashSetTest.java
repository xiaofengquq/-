package Package24;

import java.util.HashSet;
import java.util.Set;

/*
    HashSet集合：
        无序不可重复
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello3");
        set.add("hello4");
        set.add("hello1");
        set.add("hello2");
        set.add("hello3");
        set.add("hello3");
        set.add("hello3");
        //  调用HashSet父类的toString()方法
        //  实际使用了迭代器进行遍历
        System.out.println(set);
        //  [hello1, hello4, hello2, hello3]
        //  存进去的顺序和取出来的顺序不一样
        //  重复元素并没有实际存储成功
    }
}
