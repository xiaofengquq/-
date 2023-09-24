package Package24.Collection.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
    让TreeSet集合中元素可排序的第二种方式：使用比较器的方式

    Comparator和Comparable怎么选择？
        当比较规则不会发生改变，或者比较规则之后一个的时候，建议实现 Comparator 接口
        当比较规则有多个，并且需要多个比较规则之间频繁切换，建议实现 Comparable 接口
 */
public class TreeSetTest05 {
    public static void main(String[] args) {
        System.out.println("提前构造好Comparator比较器传入：");
        CompareAnimal c = new CompareAnimal();
        //  在使用TreeSet构造方法创建set集合时，传入已经写好的Comparator比较器
        Set<Animal> set = new TreeSet<>(c);
        set.add(new Animal(10));
        set.add(new Animal(20));
        set.add(new Animal(40));
        set.add(new Animal(5));
        set.add(new Animal(2));
        Iterator<Animal> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("---------------------");
        /*
            也可以使用匿名内部类来构造比较器
         */
        System.out.println("使用匿名内部类来构造比较器：");
        Set<Animal> set1 = new TreeSet<>(new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.age - a2.age;
            }
        });
        set1.add(new Animal(59));
        set1.add(new Animal(48));
        set1.add(new Animal(75));
        set1.add(new Animal(20));
        set1.add(new Animal(11));
        Iterator<Animal> i1 = set1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }
}

/*  让TreeSet集合中元素可排序的第一种方式：实现Comparable接口及compareTo方法
class Animal implements Comparable<Animal>{
    int age;

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal[" +
                "age=" + age +
                ']';
    }

    @Override
    public int compareTo(Animal a) {
        return this.age - a.age;
    }
}*/

/*
    让TreeSet集合中元素可排序的第二种方式：单独编写实现了Comparator的比较器
 */
class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal[" +
                "age=" + age +
                ']';
    }
}

/*
    单独编写比较器
        比较器实现java.util.Comparator接口
 */
class CompareAnimal implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.age - a2.age;
    }
}

