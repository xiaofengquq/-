package Package24;
/*
    集合ArrayList的构造方法
 */

import java.util.*;

public class ArrayListTest01 {
    public static void main(String[] args) {
        //  默认初始化容量创建ArrayList集合
        List myList = new ArrayList();
        //  创建指定初始化容量（100）的ArrayList集合
        List myList1 = new ArrayList(100);

        //  创建HashSet集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);

        //  通过这个构造方法，就可以将HashSet集合转换成List集合
        List myList2 = new ArrayList(c);
        Iterator it = myList2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
