package Package24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    1、JDK5.0之后推出的新特性：
        泛型
    2、泛型这种语法机制，只会在程序编译阶段起作用，只是给编译器参考的。（运行阶段泛型没用！）
    3、使用泛型机制的好处：
        第一：集合存储的元素类型统一了
        第二：从集合中取出来的元素类型是泛型指定的类型，不需要进行大量的“向下转型”！
    4、泛型的缺点是什么？
        泛型会导致集合中存储元素缺乏多样性
        但是，在大多数业务中，集合中元素类型都是统一的。
        因此这种泛型特性被大家所认可
 */
public class GenericTest {
    public static void main(String[] args) {
        //  不使用泛型机制，分析程序存在缺点
        //  1、缺乏类型安全性：
        //      由于集合 myList 是使用原始的 ArrayList 类型声明的，它可以存储任何类型的对象。
        //      在遍历集合时，需要手动进行类型检查和类型转换，如 (Cat) o 和 (Bird) o。
        //      如果在添加对象到集合时出现了类型错误，或者在遍历过程中出现了不匹配的类型，将会导致运行时异常。
        //      这种缺乏类型安全性增加了代码编写和维护的复杂性，并增加了出错的风险。
        //  2、可读性差：
        //      由于缺乏泛型的类型信息，代码中的类型检查和类型转换使得代码变得冗长和难以理解。
        //      需要使用 instanceof 运算符进行类型判断，并通过强制类型转换来调用特定对象的方法。
        //      这降低了代码的可读性，并且需要开发人员对集合中存储的对象类型有明确的了解。
        //  3、难以维护和扩展：
        //      在不使用泛型的情况下，如果需要修改集合中存储的对象类型，或者添加新的对象类型，需要手动修改代码中的类型检查和类型转换部分。
        //      这增加了代码维护的复杂性，并且容易引入错误。
        //      如果代码中存在多处需要进行类型检查和类型转换的地方，修改起来会更加困难。
        List myList = new ArrayList();
        //  准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        //  将对象添加到集合当中
        myList.add(c);
        myList.add(b);

        //  遍历集合，取出Cat让他抓老鼠，取出Bird让它飞
        Iterator it = myList.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (o instanceof Cat) {
                ((Cat) o).catchMouse();
            }
            if (o instanceof Bird) {
                ((Bird) o).fly();
            }
        }

        //  使用JDK5之后的泛型机制
        //  使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据
        //  用泛型来指定集合中存储的数据类型
        List<Animal> list = new ArrayList<>();

        //  指定List集合中只能存储Animal，存储String就会编译报错
        //  这样使用泛型之后，集合中元素的数据类型就更加统一了
//        list.add("123");
        Cat cat = new Cat();
        Bird bird = new Bird();
        list.add(c);
        list.add(b);

        //  通过查阅源代码，可以看到Iterator接口是可以用泛型的
        //  public interface Iterator<E>
        //  这个表示迭代器迭代的是Animal类型
        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()) {
            Animal a = (Animal) it.next();
            if (a instanceof Bird) {
                ((Bird) a).fly();
            } else if (a instanceof Cat) {
                ((Cat) a).catchMouse();
            }
        }
    }
}

class Animal {

    public void move() {
        System.out.println("Animals are moving.");
    }
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println("Cat is catching the mouse.");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("Birds are flying.");
    }
}