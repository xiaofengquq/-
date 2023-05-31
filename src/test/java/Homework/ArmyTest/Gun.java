package Homework.ArmyTest;
/*
    移动和攻击是功能，应该用接口来实现，不同的武器（子类）实现不同的接口以满足不同的功能
    父类可以不用实现攻击和移动的接口
 */
public class Gun extends Weapon implements Attackable {
    public void attack() {
        System.out.println("枪开火！");
    }
}
