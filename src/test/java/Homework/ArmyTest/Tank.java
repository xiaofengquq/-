package Homework.ArmyTest;

public class Tank extends Weapon implements Attackable, Moveable {
    public void attack() {
        System.out.println("坦克开火！");
    }

    public void move() {
        System.out.println("坦克移动！");
    }
}
