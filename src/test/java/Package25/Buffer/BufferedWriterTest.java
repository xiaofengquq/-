package Package25.Buffer;

import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) {
        try (BufferedWriter output = new BufferedWriter(
                new FileWriter("E:\\src\\-\\src\\test\\java\\Package25\\Buffer\\BufferedWriter.txt")
        )) {
            char[] chars = new char[]{'啵', '么', '嘿', '哈'};
            output.write(chars);

            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
