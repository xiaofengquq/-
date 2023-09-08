package Homework.DirectoryCopy;

import java.io.File;

/*
    要求：
        将整个目录及下面的内容全部拷贝到另一个目录下
 */
public class DirectoryCopy {
    public static void printAllSubPath(String sourcePath) {
        File sourceFile = new File(sourcePath);
        if (sourceFile.exists() && sourceFile.isDirectory()) {
            File[] files = sourceFile.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println("目录：" + file);
                        printAllSubPath(file.getAbsolutePath());
                    } else {
                        System.out.println("文件：" + file);
                    }
                }
            }
        } else {
            System.out.println("源目录不存在/不是一个目录");
        }
    }
}
