package Homework.RegistrationTest;

import java.util.Scanner;

public class RegistrationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();

        System.out.println("请输入密码");
        String password = sc.next();
        try {
            new Registration().register(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
