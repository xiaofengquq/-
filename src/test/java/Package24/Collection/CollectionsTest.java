package Package24.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    java.util.Collection    集合接口
    java.util.Collections   集合工具类，方便集合的操作
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //  ArrayList不是线程安全的
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("set");
        list.add("ArrayList");
        list.add("HashMap");
        System.out.println("未排序list：" + list);
        //  将ArrayList变成线程安全的
        Collections.synchronizedList(list);
        //  将集合进行排序
        //  使用sort方法的前提，需要传参实现了Comparable接口
        //  public static <T extends Comparable<? super T>> void sort(List<T> list)
        //  由于String类实现了Comparable接口
        //      public final class String
        //          implements java.io.Serializable, Comparable<String>, CharSequence
        //  因此Collections.sort()可以传递List<String>当做参数来排序
        Collections.sort(list);
        System.out.println("已排序list：" + list);
    }
}
