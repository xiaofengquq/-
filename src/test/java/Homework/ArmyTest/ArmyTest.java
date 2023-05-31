package Homework.ArmyTest;

public class ArmyTest {
    public static void main(String[] args) {
        try {
            Army a = new Army(4);
            a.addWeapon(new Gun());
            a.addWeapon(new Tank());
            a.addWeapon(new Weapon());
            a.attackAll();
            a.moveAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
