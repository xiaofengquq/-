package Package25.ObjectStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/test/java/Package25/ObjectStream/student");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            System.out.println(ois.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
