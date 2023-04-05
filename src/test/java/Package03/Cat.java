package Package03;

public class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫在跑动");
    }

    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
