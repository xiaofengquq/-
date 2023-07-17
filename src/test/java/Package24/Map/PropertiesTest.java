package Package24.Map;

import java.util.Properties;

/*
    目前只需要掌握Properties属性类对象的相关方法即可。
    Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型的
    Properties被称为属性类对象
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties p = new Properties();
        //  需要掌握Properties的两个方法，一个存，一个取。
        p.setProperty("key1", "value1");
        p.setProperty("key2", "value2");
        p.setProperty("key3", "value3");

        //  通过key获取value
        String s1 = p.getProperty("key1");
        String s2 = p.getProperty("key2");
        String s3 = p.getProperty("key3");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
