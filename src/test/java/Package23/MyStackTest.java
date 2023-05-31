package Package23;

import Package23.MyStack;

public class MyStackTest {
    /*
        自定义异常在实际开发中的应用
     */
    public static void main(String[] args) {
        MyStack m = new MyStack(10);
        try {
            for (int i = 0; i < 11; i++) {
                m.push(m, new Object());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            for (int i = 0; i < 11; i++) {
                m.pop(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
