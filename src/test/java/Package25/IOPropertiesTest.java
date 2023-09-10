package Package25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*
    IO + Properties的联合应用。
    一个很好的设计理念：
        经常改变的数据，可以单独写在文件当中，使用程序动态读取
        以后只需要修改这个文件的内容，java代码不需要改动，不需要重新编译，
        服务器也不用重启，就可以拿到动态的信息

    类似于以上机制的文件，被称为配置文件。
    并且当配置文件中的内容格式为：
        key1 = value1
        key2 = value2
    的时候，我们把配置文件叫做属性配置文件

    java规范要求，属性配置文件建议以 .properties结尾，但不是必须的
    Properties是专用存放属性配置文件内容的一个类
 */
public class IOPropertiesTest {
    public static void main(String[] args) {

        //  新建一个输入流对象
        try (FileInputStream fis = new FileInputStream("src/test/java/Package25/userinfo.properties")) {
            /*
            Properties是一个Map集合，key和value都是String类型
            尝试将userinfo文件中的数据加载到Properties对象中
         */
            Properties pro = new Properties();
            //  调用Properties对象的load方法将文件中的数据加载到Map集合中
            //  其中，"="左边做key，"="右边做value
            pro.load(fis);
            System.out.println(pro.getProperty("username"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
