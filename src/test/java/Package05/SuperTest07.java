package Package05;
/**
 * super什么时候不能省略?
 *      父类和子类中有同名属性或者相同的方法，
 *      想在子类中访问父类的属性或方法时，super.不能省略
 * */

public class SuperTest07 {
    public static void main(String[] args) {
        new Cat().inAction();
    }
}

class Animal {
    //所有动物均可以移动
    public void move() {
        System.out.println("Animals are moving!");
    }
}

class Cat extends Animal {
    //对move进行重写

    @Override
    public void move() {
        System.out.println("Cats are moving!");
    }

    public void inAction() {
        this.move();//Cats are moving!
        move();//Cats are moving!
        super.move();//Animals are moving!
    }
}