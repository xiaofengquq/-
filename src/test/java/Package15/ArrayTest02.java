package Package15;

public class ArrayTest02 {


    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Cat(), new Bird(), new Animal()
        };
        for (Animal animal : animals) {
            animal.move();
        }
    }
}

class Animal {
    public void move() {
        System.out.println("Animals are moving.");
    }
}

class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("Cats walk on the catwalk");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Birds are flying.");
    }
}