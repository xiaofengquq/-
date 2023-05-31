package Homework.ArmyTest;

import java.util.Arrays;

/*
    开放型题目，随意发挥:
        写一个类Army,代表一支军队，这个类有一个属性Weapon数组w（用来存储该军队所拥有的所有武器）
        该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量。
        并用这一大小来初始化数组w。

        该类还提供一个方法addWeapon(Weapon wa)表示把数wa所代表的武器加入到数组w中。
        在这个类中还定义两个方法
            attackAll()让w数组中的所有武器攻击;
            moveAll()让数组中的所有可移动的武器移动。

        写一个主方法去测试以上程序。
        提示:
            Weapon是一个父类，应该有很多子武器。
            这些子武器应该有一些是可移动的，有一些是可攻击的。
 */
public class Army {
    private Weapon[] w;

    public Weapon[] getW() {
        return w;
    }

    public void setW(Weapon[] w) {
        this.w = w;
    }

    public Army() {
    }

    public Army(int weaponMaxNo) {
        w = new Weapon[weaponMaxNo];
    }

    public int weaponFullOrNot() {
        //  Arrays.asList()方法将指定数组转化为list，之后可以调用list的indexOf方法快速获取list元素的下标
        //  返回-1即原数组中没有该元素
        return Arrays.asList(w).indexOf(null);
    }

    public void addWeapon(Weapon wa) {
        int index = weaponFullOrNot();
        if (null == wa) {
            throw new WeaponException("禁止添加空武器");
        }
        if (-1 == index) {
            throw new WeaponException("武器库已满");
        } else {
            w[index] = wa;
        }
    }

    public void attackAll() {
        for (Weapon w : w) {
            if (null == w) {
                break;
            }
            if (w instanceof Attackable){
                //  如果武器是一个可攻击的（实现了攻击接口），说明其可以攻击（调用攻击方法）
                Attackable attackable = (Attackable)w;
                attackable.attack();
            }
        }
    }

    public void moveAll() {
        for (Weapon w : w) {
            if (null == w) {
                break;
            }
            if (w instanceof Moveable){
                //  如果武器是一个可移动的（实现了移动接口），说明其可以移动（调用移动方法）
                Moveable moveable = (Moveable)w;
                moveable.move();
            }
        }
    }

}
