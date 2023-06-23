package Package24;

/*
    可以自定义泛型吗？
        可以
 */

//  虽然随便写啥作为泛型标识符都行，
//  但是一般写 T 或者 E
//  E为Element单词首字母
//  T为Type单词首字母
public class GenericTest02<标识符随便写> {
    public void doSome(标识符随便写 o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        //  new对象的时候指定了泛型为：String
        GenericTest02<String> g1 = new GenericTest02<>();

        //  类型不匹配
//        g1.doSome(123);

        GenericTest02<Integer> g2 = new GenericTest02<>();
        g2.doSome(123);
        //  类型不匹配
//        g2.doSome("123");
    }
}

