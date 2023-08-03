package Package24.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

/*
    先按照年龄升序，如果年龄一样再按照姓名升序
 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        Set<User> set = new TreeSet<>();

        User u1 = new User(20, "王sir");
        User u2 = new User(30, "候sir");
        User u3 = new User(20, "顾sir");
        set.add(u1);
        set.add(u2);
        set.add(u3);

        for (User u : set) {
            System.out.println(u.toString());
        }
    }
}

class User implements Comparable<User>{
    int age;
    String name;

    @Override
    public String toString() {
        return "User[age = " + this.age + ", name = " + this.name + "]";
    }


    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
  /*
    compareTo()方法的返回值很重要
        返回0表示相同，value会覆盖【10 - 9 = 1，1 > 0说明左边这个数比较大，所以在右子树上找
        返回>0，会继续在右子树上找
        返回<0，会继续在左子树上找
   */
    @Override
    public int compareTo(User c) {
        //  在这里写排序规则，即按照什么顺序进行排序
        if (this.age != c.age) {
            //  如果两个User的年龄不一样，按照年龄升序排序
            return this.age - c.age;
        } else {
            //  如果两个User的年龄相同，按照姓名升序排序
            return this.name.compareTo(c.name);
        }
    }
}