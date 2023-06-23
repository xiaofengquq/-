package Package24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    在JDK8之后，引入了自动类型推断机制。（又称为钻石表达式）
 */
public class GenericTest01 {
    public static void main(String[] args) {
        //  ArrayList<这里的类型会自动推断>()，前提是JDK8之后才允许
        //  自动类型推断（钻石表达式）
        List<Animal> myList = new ArrayList<>();
        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()) {
            Animal a = it.next();
            a.move();
        }
    }
}

