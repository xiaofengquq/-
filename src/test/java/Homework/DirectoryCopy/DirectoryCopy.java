package Homework.DirectoryCopy;

import java.io.File;

import static Homework.DirectoryCopy.isEmptyDirectory.*;

/*
    要求：
        将整个目录及下面的内容全部拷贝到另一个目录下
 */
public class DirectoryCopy {
    public static void main(String[] args) {
        // 调用函数并打印中间路径
        System.out.printf(getMidPath("src/test/java/Homework", "src/test/java/Homework/DirectoryCopy"));
    }

    /**
     * 递归打印源目录下的所有子目录和文件，并执行拷贝操作
     *
     * @param srcPath     源目录的路径
     * @param currentPath 当前处理的目录的路径
     * @param desPath     目标目录的路径
     */
    public static void directoryCopy(String srcPath, String currentPath, String desPath) {
        File currentFile = new File(currentPath);
        // 如果原路径存在且是个目录则继续处理
        if (currentFile.exists() && currentFile.isDirectory()) {
            // 获取当前目录下的子目录和文件列表
            File[] files = currentFile.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory() && isEmptyDirectory(file) == notEmpty) {
                        System.out.println("目录：" + file);
                        // 递归调用以处理子目录
                        directoryCopy(srcPath, file.getAbsolutePath(), desPath);
                    } else if (isEmptyDirectory(file) == isEmpty) {
                        System.out.println("空文件夹" + file.getAbsolutePath());
                    } else {
                        // 处理文件拷贝
                        File resultFile = new File(desPath, getMidPath(srcPath, file.getAbsolutePath()));
//                        try (FileInputStream fis = new FileInputStream(file.getAbsoluteFile());
//                             FileOutputStream fos = new FileOutputStream(resultFile.getAbsoluteFile())) {

//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
                        System.out.println("最终目标路径：" + resultFile.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("源目录不存在/不是一个目录");
        }
    }

    /**
     * 获取子路径相对于父路径的中间路径
     *
     * @param parentPath 父路径
     * @param subPath    子路径
     * @return 子路径相对于父路径的中间路径
     * @throws DirectoryCopyException 当子路径不包含父路径时抛出异常
     */
    public static String getMidPath(String parentPath, String subPath) {
        if (subPath.contains(parentPath)) {
            File parentFile = new File(parentPath);
            // 截取从父路径最后一级开始，到子路径结束的路径
            String tempString = parentFile.getName() + subPath.substring(parentPath.length());
            // 判断操作系统，返回相应的路径分隔符
            return subPath.contains("\\") ? ("\\" + tempString) : ("/" + tempString);
        } else {
            throw new DirectoryCopyException("子路径不包含父路径");
        }
    }

    public static isEmptyDirectory isEmptyDirectory(File directory) {
        if (directory.isDirectory()) {
            String[] filesAndDirs = directory.list();
            if (filesAndDirs != null && filesAndDirs.length == 0) {
                //  文件夹为空，返回枚举isEmpty
                return isEmpty;
            } else {
                //  文件夹不为空，返回枚举notEmpty
                return notEmpty;
            }
        }
        return isFile; // 如果不是目录，返回枚举isFile
    }
}
