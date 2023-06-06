package Package24;

import java.util.ArrayList;
import java.util.Collection;

/*
    深入Collection集合的contains()和remove()方法
        boolean contains(Object o);
            判断集合中是否包含某个对象o
            如果包含返回true，如果不包含返回false
        boolean remove(Object o);
            删除集合中的元素
            删除成功返回true，删除失败返回false

    由于Collection集合中的方法底层都依赖equals()方法，因此放入集合中的元素（尤其是自定义类）

        必须重写equals()方法

    迭代器remove()方法在执行时，是将原集合存成快照，通过操作快照来对集合进行操作
    如果在遍历的时候，直接调用集合的remove()方法来删除元素，会导致迭代器快照和集合对应不上，抛出异常
    因此遍历时想要删除集合中的元素：

        需要使用迭代器的remove()方法来操作快照中的元素

 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //  创建集合对象
        Collection c = new ArrayList();

        //  向集合中存储元素
        String s1 = new String("abc");
        String s2 = new String("def");
        c.add(s1);
        c.add(s2);

        String x = new String("abc");
        x.equals(s1);   //这里是true
        System.out.println(c.contains(x));  //  true，contains方法底层调用的是equals方法

        //  集合c删除"abc"
        //  这里remove()方法传参是x，但是成功把s1（abc字符串）删除了，证明remove()方法底层调用equals()方法来判断是否包含元素
        System.out.println("集合c" + (c.remove(x) ? "成功" : "没有成功") + "删除abc");;
    }
}
