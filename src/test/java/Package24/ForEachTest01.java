package Package24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    集合使用forEach
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        //  添加元素
        myList.add("123");
        myList.add("adb");
        myList.add("word");
        myList.add("Hello");

        //  使用迭代器遍历
        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=======================================");

        //  使用加强for循环遍历
        for (String s : myList) {
            System.out.println(s);
        }

        System.out.println("=======================================");

        //  使用下标方式（只针对有下标的集合）
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
