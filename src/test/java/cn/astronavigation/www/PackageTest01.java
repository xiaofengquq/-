package cn.astronavigation.www;
/**
 * 关于java语言当中的包机制:
 *      1、包又称为package，java中引入package这种语法机制主要是为了方便程序的管理不同功能的类被分门别类放到不同的软件包当中，查找比较方便，管理比较方便，易维护。
 *
 *      2、怎么定义package昵?
 *          - 在java源程序的第一行上编写package语句
 *          -package只能编写一个语句。
 *          -语法结构:
 *              package 包名
 *
 *      3、包名的命名规范:
 *          公司域名倒序+项目名+ 模块名+功能名:
 *          采用这种方式重名的几率较低。因为公司域名具有全球唯一性
 *              例如:
 *              cn.astronavigation.www;
 *
 *      4、包名要求全部小写，包名也是标识符，必须遵守标识符的命名规则
 *
 *      5、一个包对应一个目录。
 *
 *      6、使用了package机制制之后，应该怎么编译?怎么运行呢?
 *          -使用了package机制之后，类名不再是Test01了，类名是: cn.astronavigation.www.Test01
 * */
public class PackageTest01 {
    public static void main(String[] args) {
        System.out.println("Test01");
    }
}
