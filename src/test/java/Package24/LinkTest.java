package Package24;

public class LinkTest {
    public static void main(String[] args) {
        Link<Object> link = new Link();
        link.add(100);//    100
        link.add(200);//    100 200
        link.add(300);//    100 200 300
        link.modify(200, 400);//    100 400 300
        link.add("abc");//    100 400 300 abc
        link.remove(300);//    100 400 abc
        link.printLink();
        System.out.println("链表的长度是" + link.getSize());
    }
}
