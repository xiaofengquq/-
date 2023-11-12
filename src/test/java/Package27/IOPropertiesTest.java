package Package27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.stream.Stream;

public class IOPropertiesTest {
    public static void main(String[] args) {
        //  这样可以通过修改配置文件的方式来修改获取到的类名

        //  先拿到一个绝对路径，然后把绝对路径当做传参拿到流

//        String path = Thread.currentThread().getContextClassLoader()
//                .getResource("classinfo123.properties").getPath();
//        try (FileInputStream fis = new FileInputStream(path)) {
//            Properties properties = new Properties();
//            properties.load(fis);
//            String className = properties.getProperty("className");
//            System.out.println(className);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //  可以直接返回流
        try (InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo123.properties");) {
            Properties properties = new Properties();
            properties.load(inputStream);
            String className = properties.getProperty("className");
            System.out.println(className);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
