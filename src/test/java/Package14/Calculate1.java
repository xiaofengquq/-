package Package14;

//使用匿名内部类，可以不写接口的实现类
public class Calculate1 implements Calculate {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
