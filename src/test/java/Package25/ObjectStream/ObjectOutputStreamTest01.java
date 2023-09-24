package Package25.ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
    能否一次序列化多个对象呢？
        可以，将对象放入集合当中，序列化集合即可
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
        StudentSerializable studentSerializable = new StudentSerializable(100, "小风");
        Car car = new Car("蓝色", 120, "啦啦啦");
        try (FileOutputStream fos = new FileOutputStream("src/test/java/Package25/ObjectStream/objectList");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             FileInputStream fis = new FileInputStream("src/test/java/Package25/ObjectStream/objectList");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<Object> objects = new ArrayList<>();
            objects.add(studentSerializable);
            objects.add(car);
            oos.writeObject(objects);
            System.out.println(ois.readObject());

            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
