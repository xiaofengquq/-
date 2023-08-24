package Package25.Data;

import java.io.*;

/*
    DataInputStream：数据字节输入流
    DataOutputStream写的文件，只能用DataInputStream去读，并且读的时候你得提前知道写入的顺序
 */
public class DataInputStreamTest {
    public static void main(String[] args) {
        try (DataInputStream dataInput = new DataInputStream(
                new FileInputStream("E:\\src\\-\\src\\test\\java\\Package25\\Data\\DataOutputStream")
        )) {
            byte b = 1;
            short s = 2;
            int i = 3;
            long l = 4;
            float f = 5;
            double d = 6;
            boolean bl = true;
            char c = 7;
            //  按照写入顺序读取
            System.out.println(dataInput.readByte());
            System.out.println(dataInput.readShort());
            System.out.println(dataInput.readInt());
            System.out.println(dataInput.readLong());
            System.out.println(dataInput.readFloat());
            System.out.println(dataInput.readDouble());
            System.out.println(dataInput.readBoolean());
            System.out.println(dataInput.readChar());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
