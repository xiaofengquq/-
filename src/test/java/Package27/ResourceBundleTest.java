package Package27;

import java.util.ResourceBundle;

/*
    java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
        使用这种方式的时候，属性配置文件xxx.properties必须放在类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        /*
            使用getBundle()方法的时候，传参只需要properties的文件名即可，不需要后缀
            资源绑定器，只能绑定 xxx.properties 文件。
         */
        ResourceBundle rb = ResourceBundle.getBundle("classinfo");
        String className = rb.getString("className");
        System.out.println(className);
    }
}
