package Package27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
    验证反射机制的灵活性
        java代码写一遍，在不改变Java源代码的基础上，可以做到不同对象的实例化
        非常之灵活（符合OCP开闭原则：对扩展开放，对修改关闭）
 */
public class ReflectTest03 {
    public static void main(String[] args) {
        //  通过IO流读取classinfo.properties文件
        try (FileInputStream fis = new FileInputStream("src/test/java/Package27/classinfo.properties");) {
            //  创建属性类文件
            Properties p = new Properties();
            p.load(fis);
            String className = p.getProperty("className");
            System.out.println("从文件中读取到的className ---> " + className);

            //  通过反射机制实例化对象
            Class c = Class.forName(className);
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
