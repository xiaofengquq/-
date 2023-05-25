package Homework;

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
    int stackFrame = 0;
    static Object[] objects;
    int size;

    public MyStack(int size) {
        this.size = size;
        objects = new Object[size];
    }

    public void push(Object object) {
        if (stackFrame == size) {
            System.out.println("堆栈已满");
            stackFrame--;
        } else {
            objects[stackFrame] = object;
            stackFrame++;
            System.out.println(Arrays.toString(objects));
        }
    }

    public void pop(int count) {
        if (stackFrame == 0) {
            System.out.println("堆栈已空");
            stackFrame++;
        } else if (count - 1 > stackFrame) {
            System.out.println("堆栈内已压栈不足");
        } else {
            int j = stackFrame;
            for (int i = j; i > j - count; i--) {
                objects[i] = null;
                if (stackFrame > 0)
                stackFrame--;
                System.out.println(Arrays.toString(objects));
            }
        }
    }
}
