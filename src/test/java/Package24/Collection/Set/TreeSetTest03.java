package Package24.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

/*
    对于自定义的类型来说，TreeSet可以排序么？
        以下程序中，对于Person类型来说，无法排序，因为没有指定Person对象之间的比较规则

        报错：
            Exception in thread "main" java.lang.ClassCastException:
                Package24.Collection.Set.Person cannot be cast to java.lang.Comparable

        出现这个异常的原因是：
            Person没有实现java.lang.Comparable接口
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Set<Customer> set = new TreeSet<>();

        Customer c1 = new Customer(20);
        Customer c2 = new Customer(30);
        Customer c3 = new Customer(11);
        set.add(c1);
        set.add(c2);
        set.add(c3);

        for (Customer c : set) {
            System.out.println(c.toString());
        }
    }
}

class Customer implements Comparable<Customer>{
    int age;

    @Override
    public String toString() {
        return "Customer[age = " + this.age + "]";
    }

    public Customer(int age) {
        this.age = age;
    }

    //  需要在这个方法中编写比较的规则
    //  k.compareTo(t.key)
    //  拿着参数k和集合中的每一个k进行比较，返回值可能是 >0, =0, <0
    //  比较规则最终还是由程序指定的：例如按照年龄降序排列

//    @Override
//    public int compareTo(Customer c) {  //  c1.compareTo(c2)
//        if (this.age > c.age) {         //  c1是this，c2是c
//            return 1;                   //  c1和c2比，就是this和c比
//        } else if (this.age == c.age) {
//            return 0;
//        }
//        return -1;
//    }

    //  可以用更简单的方法（牛，老杜，牛）
    @Override
    public int compareTo(Customer c) {
//        return this.age - c.age;//  正序
        return c.age - this.age;//  降序
    }
}