package Package25.SwitchStream;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*

 */
public class InputStreamReaderTest01 {
    public static void main(String[] args) {
//        try (FileInputStream input = new FileInputStream("src/test/java/Package25/Buffer/tempFile2.txt");
//             // 通过转换流转换（InputStreamReader将字节流转换成字符流
//             // 在这里，ir是包装流（处理流），input是节点流
//             InputStreamReader ir = new InputStreamReader(input);
//
//             // BufferedReader构造方法只能传字符流，需要把字节流转换成字符流
//             // 在这里br是包装（处理）流，ir是节点流
//             BufferedReader br = new BufferedReader(ir)) {
//            String currentLine;
//            while ((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //  改写以上代码，将转换流合并

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src/test/java/Package25/Buffer/tempFile2.txt")))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
