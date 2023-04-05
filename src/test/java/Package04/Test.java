package Package04;

public class Test {

    static void main(String[] args) {
//        Master master = new Master();
//        Pet p = new Pet();
//        master.feed(p);
        Master master = new Master();
        Dog dog = new Dog();
        /**
         * feed方法要求传递Pet，但是由于Dog继承了Pet，因此可以直接将Dog传递进去
         *  相当于执行了向上类型转换
         * */
        master.feed(dog);

        String s = "123";
    }
}
