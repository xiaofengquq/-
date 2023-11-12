package Package27;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.ResourceBundle;

public class ReflectTest05 {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("classinfo123");
        String className = resourceBundle.getString("className");
        try {
            Class<?> userClass = Class.forName(className);
            String className1 = userClass.getName();
            String className2 = userClass.getSimpleName();
            System.out.println("完整类名：" + className1);
            System.out.println("简单类名：" + className2);
            //  获取类中所有public的属性
            Field[] fields = userClass.getFields();
            System.out.println("使用getFields()方法获取到的属性：" + fields[0].getName());
            System.out.println("-----");

            //  返回一个对象数组，该数组 Field 反映此 Class 对象所表示的类或接口声明的所有字段。
            //  这包括公共字段、受保护字段、默认（包）访问字段和私有字段，但不包括继承字段。
            Field[] fields1 = userClass.getDeclaredFields();
            for (Field f : fields1) {
                System.out.println("属性名：" + f.getName());
                //  getType()方法返回的是一个Class对象
                Class<?> c = f.getType();
                String fullClassName = c.getName();
                String simpleClassName = c.getSimpleName();
                //  返回的修饰符是一个数字，每个数字是修饰符的代号
                int modify = f.getModifiers();
                //  将数字类型的修饰符转换成String
                String modifyString = Modifier.toString(modify);
                System.out.println("属性完整类名：" + fullClassName);
                System.out.println("属性简单类名：" + simpleClassName);
                System.out.println("属性修饰符：" + "[数字：" + modify +
                        ", 字符串：" + modifyString + "]");
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
