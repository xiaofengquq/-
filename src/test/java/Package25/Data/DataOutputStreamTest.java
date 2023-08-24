package Package25.Data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.DataOutputStream：数据专属流
        这个流可以将数据连同数据的类型一并写入文件
        注意：这个文件不是普通文本文件（记事本打不开）
 */
public class DataOutputStreamTest {
    public static void main(String[] args) {
        try (DataOutputStream dataOutput = new DataOutputStream(
                //  DataOutputStream的传参是一个OutputStream抽象类，我们传入他的子类 FileOutputStream
                new FileOutputStream("E:\\src\\-\\src\\test\\java\\Package25\\Data\\DataOutputStream")
        )) {
            byte b = 1;
            short s = 2;
            int i = 3;
            long l = 4;
            float f = 5;
            double d = 6;
            boolean bl = true;
            char c = 7;
            //  把数据及数据的类型一并写入文件
            dataOutput.writeByte(b);
            dataOutput.writeShort(s);
            dataOutput.writeInt(i);
            dataOutput.writeLong(l);
            dataOutput.writeFloat(f);
            dataOutput.writeDouble(d);
            dataOutput.writeBoolean(bl);
            dataOutput.writeChar(c);

            dataOutput.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
