package Package24.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

/*
    对于自定义的类型来说，TreeSet可以排序么？
        以下程序中，对于Person类型来说，无法排序，因为没有指定Person对象之间的比较规则

        报错：
            Package24.Collection.Set.Person cannot be cast to java.lang.Comparable
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();

        Person p1 = new Person(20);
        Person p2 = new Person(30);
        set.add(p1);
        set.add(p2);

        for (Person p : set) {
            System.out.println(p.toString());
        }
    }
}

class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[" +
                "age = " + age +
                ']';
    }
}
