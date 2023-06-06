package Package24;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
    关于集合遍历/迭代
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //  注意：以下讲解的遍历方式/迭代方式，是所有Collection的通用方式
        //  在Map集合中不能使用，在所有Collection以及其子类中可以使用
        //  创建集合对象
        Collection c = new HashSet();
        //  添加元素
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        //  对集合Collection进行遍历/迭代
        //  第一步：获取集合对象的迭代器对象Iterator（迭代器最初并没有指向第一个元素）
        Iterator it = c.iterator();
        //  第二步：通过以上获取的迭代器对象开始遍历/迭代
        /*
            以下两个方法是迭代器Iterator中的方法
                boolean hasNext();  如果仍然有元素可以迭代，返回true。
                Object next();      返回迭代的下一个元素。
         */
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
