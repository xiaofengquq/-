package Homework.DirectoryCopy;

public enum isEmptyDirectory {
    isEmpty("目录为空"),
    notEmpty("目录不为空"),
    isFile("不是个目录");
    private final String name;

    isEmptyDirectory(String name) {
        this.name = name;
    }
}
