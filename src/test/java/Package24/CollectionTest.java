package Package24;

import java.util.*;

/*
    关于java.util.Collection接口
        1、Collection能存放什么元素？
            没有使用“泛型”之前，Collection中可以存储Object的所有子类型
            使用了“泛型”之后，Collection中只能存储某个具体的类型（集合中不能存储基本数据类型，只能存储对象的内存地址）
        2、Collection中的常用方法
            boolean add(Object e);      向集合中添加元素
            int size();                 获取集合中元素的个数
            void clear();               清空集合
            boolean contains(Object o); 判断当前集合中是否包含元素o，包含返回true，不包含返回false
            boolean remove(Object o);   删除集合中的某个元素
            boolean isEmpty();          判断集合是否为空
            Object[] toArray();         将集合转换为数组
 */
public class CollectionTest {
    public static void main(String[] args) {
        //  创建一个集合对象
        //  多态
        Collection c = new ArrayList();
        c.add(100);//   自动装箱实际上放进去的是new Integer(100);
        c.add(3.14);//   自动装箱实际上放进去的是new Double(3.14);
        c.add(new Object());
        c.add(new Exception());
        c.add(true);//   自动装箱实际上放进去的是new Boolean(true);
        System.out.println(c);

        //  获取集合中元素的个数
        System.out.println("集合c中元素个数是：" + c.size());

        //  判断集合中是否包含3.14
        System.out.println(c.contains(3.14) ? "集合c中包含3.14" : "集合c中不包含3.14");

        //  删除集合中的3.14
        System.out.println((c.remove(3.14) ? "成功" : "没有成功") + "删除集合c中的3.14");

        //  清空集合
        c.clear();
        System.out.println(c);
        System.out.println("集合c中元素个数是：" + c.size());

        //  判断集合是否为空
        System.out.println("集合c" + (c.isEmpty() ? "为" : "不为") + "空");

        c.add("abc");
        c.add(123);
        c.add(3.14);
        //  调用toArray()方法将集合c转换为Object数组
        System.out.println(Arrays.toString(c.toArray()));

    }
}
