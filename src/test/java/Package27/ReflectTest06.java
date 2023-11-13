package Package27;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 通过反射机制，反编译一个类的属性Field。
 */
public class ReflectTest06 {
    public static void main(String[] args) {
        // 用老方法打印一个类的属性
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo123.properties").getPath();
        Properties properties = new Properties();
        String className;
        try (FileInputStream fis = new FileInputStream(path)) {
            properties.load(fis);
            className = properties.getProperty("className");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            // 获取类对象
            Class<?> c1 = Class.forName(className);

            // 打印类的属性名
            Field[] fields = c1.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("------");

        // 使用 ResourceBundle 获取类名
        StringBuilder sb = new StringBuilder();
        ResourceBundle rb = ResourceBundle.getBundle("classinfo123");
        className = rb.getString("className");
        try {
            // 获取类对象
            Class<?> c1 = Class.forName(className);

            // 构建字符串，表示类的结构
            String modifier = Modifier.toString(c1.getModifiers());
            sb.append(modifier).append(" class ").append(c1.getSimpleName())
                    .append(" {");
            Field[] fields = c1.getDeclaredFields();
            for (Field f : fields) {
                sb.append("\n" + "\t");
                String fieldModifier = Modifier.toString(f.getModifiers());
                Class<?> fieldClass = f.getType();
                String fieldType = fieldClass.getSimpleName();
                sb.append(fieldModifier).append(" ")
                        .append(fieldType).append(" ")
                        .append(f.getName()).append(";");
            }
            sb.append("\n" + "}");

            // 打印类的结构
            System.out.println(sb);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}