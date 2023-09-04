package Homework.DirectoryCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
    要求：
        将整个目录及下面的内容全部拷贝到另一个目录下
 */
public class DirectoryCopy {
    public static void directoryCopy(String filePath) {
        if (filePath == null || filePath.isEmpty()) {
            throw new DirectoryCopyException("目标路径为空");
        }
        try {
            File f = new File(filePath);
            File f1 = new File("src/test/java/Homework/DirectoryCopy/" + f.getName());
            f1.mkdir();
            File[] files = f.listFiles();
            for (File file : files) {
                try (FileInputStream fis = new FileInputStream(file.getAbsoluteFile());
                     FileOutputStream fos = new FileOutputStream("src/test/java/Homework/DirectoryCopy/" + f1.getName() + "/" + file.getName());) {
                    int readCount;
                    byte[] bytes = new byte[1024];
                    while ((readCount = fis.read(bytes)) != -1) {
                        fos.write(bytes, 0, readCount);
                    }

                    fos.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
