package Package25.ObjectStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
    1、参与序列化和反序列化的对象，必须实现Serializable接口

    2、Serializable接口只是一个标志接口
    public interface Serializable {

    }
    这个接口中什么都没有，仅起到一个标识的作用，java虚拟机对于被标志的类会特殊处理。
    Serializable这个标志接口是给java虚拟机参考的，
    java虚拟机看到这个接口之后，会为该类自动生成一个序列化版本号

    3、序列化版本号有什么用呢？
        java.io.InvalidClassException:
        Package25.ObjectStream.Student;
        local class incompatible:
            stream classdesc serialVersionUID = -7007979862043768405,
            local class serialVersionUID = 4310988525265268456
       java语言中是通过什么机制区分类的？
            第一：首先是类名，如果类名不一样，肯定不是同一个类。
            第二：如果类名一样，靠序列化版本号进行区分（实现Serializable接口会自动生成序列化版本号）

       这种自动生成序列化版本号有什么缺陷？
            一旦代码确定之后，不能进行后续的修改
            只要修改，必定会重新编译，此时会生成全新的序列化版本号，
            这时候java虚拟机会认为这是一个全新的类

       最终结论：
            凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号
            这样，以后这个类即使修改了，java虚拟机也会认为是同一个类
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        StudentSerializable studentSerializable = new StudentSerializable(100, "小风");
        try (FileOutputStream fos = new FileOutputStream("src/test/java/Package25/ObjectStream/student");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(studentSerializable);

            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
