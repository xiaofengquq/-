package Package23;

import java.util.Arrays;

/*
    编写程序，使用一维数组，模拟栈数据结构。
    要求:
        1、这个栈可以存储java中的任何引用类型的数据。
        2、在栈中提供push方法模拟压栈。(栈满了，要有提示信息。)
        3、在栈中提供pop方法模拟弹栈。 (栈空了，也有有提示信息)
        4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
 */

public class MyStack {
    private int stackFrame = 0;
    private final Object[] objects;
    private final int size;

    public MyStack(int size) {
        this.size = size;
        this.objects = new Object[size];
    }

    public void push(MyStack m, Object object) throws MyStackOperationException {
        if (m.stackFrame > size - 1) {
            throw new MyStackOperationException("堆栈已满，压栈失败");
            //  这里不用try..catch的原因是，这个异常是自己new的，自己new自己捕捉没有意义，因此选择throws（往外抛）
            //  栈已满这个信息需要传递出去

        } else {
            objects[stackFrame] = object;
            stackFrame++;
            System.out.println(Arrays.toString(objects));
        }
    }

    public void pop(MyStack m) throws MyStackOperationException {
        if (stackFrame == 0) {
            throw new MyStackOperationException("堆栈已空，压栈失败");
        } else {
            objects[stackFrame - 1] = null;
            stackFrame--;
            System.out.println(Arrays.toString(objects));
        }
    }
}
