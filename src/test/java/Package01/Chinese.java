package Package01;

public class Chinese {
    String name;

    String id;

    //String country = "中国";
    //这样虽然不用重新赋值，但是每个中国人还是拥有单独的、相同的同一个国际
    //因此正确的方法是将这种相同的变量设置为静态变量
    static String country = "中国";

    public Chinese() {

    }

    public Chinese(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
