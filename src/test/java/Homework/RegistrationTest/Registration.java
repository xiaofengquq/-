package Homework.RegistrationTest;

/*
    编写程序模拟用户注册：
        1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
        2、输入信息之后，后台java程序模拟用户注册。
        3、注册时用户名要求长度在[6-14]之间，小于或大于都表示异常。

    注意：
        完成注册的方法放到一个单独的类中。
        异常类自定义即可

        class Registration {
            public void register(String username, String password) {
                //这个方法中完成注册!
            }
        }

        编写main方法，在main方法中接收用户输入的信息，在main方法中调用UserService的register()方法完成注册
 */
public class Registration {
    /**
     * 用户注册
     * @param username  用户名
     * @param password  密码
     */
    public void register(String username, String password) {
        /*
            引用等于null的这个判断最好放到所有条件的最前面
         */
        if (username == null || username.length() < 6 || username.length() > 14) {
            throw new RegistrationException("用户名长度不符，请输入6-14位字符的用户名");
        }
        System.out.println("注册成功!");
    }
}
