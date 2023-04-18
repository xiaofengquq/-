package Test01.HotelManagementSystem;

import java.util.Scanner;

public class HotelManagementSystem {
    /*
        为某个酒店编写程序:酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
        1、该系统的用户是，酒店前台
        2、酒店使用一个二维数组来模拟。"Room[][] hotel;"
        3、酒店中的每一个房间应该是一个java对象: Room
        4、每一个房间Room应该有: 房间编号、房间类型属性、房间是否空闲
        5、系统应该对外提供的功能:
            可以预定房间: 用户输入房间编号，订房
            可以退房:用户输入房间编号，退房。
            可以查看所有房间的状态: 用户输入某个指令应该可以查看所有房间状态。
     */
    Hotel hotel;
    Scanner scanner = new Scanner(System.in);

    public HotelManagementSystem() {
        hotel = new Hotel();
    }

    public void reserve() {
        System.out.println("请输入预定房间号：");
        int number = check();
        Room room = hotel.getRooms()[number / 100 - 1][number % 100 - 1];
        if (room.isEmpty()) {
            room.setEmpty(false);
            System.out.println("预定成功，您预订的房间信息为：" + room.toString());
        } else {
            System.out.println("预定失败，房间已满");
        }
        while (true) {
            System.out.println("继续预定请输入y，结束预定请输入n，打印房间列表请输入p");
            String str = scanner.next();
            if ("y".equalsIgnoreCase(str)) {
                reserve();
            } else if ("p".equalsIgnoreCase(str)) {
                print();
                continue;
            } else if (!"n".equalsIgnoreCase(str)) {
                System.out.println("输入错误");
                continue;
            }
            return;
        }
    }

    public void checkOut() {
        System.out.println("请输入退房房间号：");
        int number = check();
        Room room = hotel.getRooms()[number / 100 - 1][number % 100 - 1];
        if (!room.isEmpty()) {
            room.setEmpty(true);
            System.out.println("退房成功，您预订的房间信息为：" + room.toString());
        } else {
            System.out.println("退房失败，房间空闲");
        }
        while (true) {
            System.out.println("继续退房请输入y，结束退房请输入n，打印房间列表请输入p");
            String str = scanner.next();
            if ("y".equalsIgnoreCase(str)) {
                checkOut();
            } else if ("p".equalsIgnoreCase(str)) {
                print();
                continue;
            } else if (!"n".equalsIgnoreCase(str)) {
                System.out.println("输入错误");
                continue;
            }
            return;
        }
    }

    public void print() {
        for (Room[] rooms : hotel.getRooms()) {
            for (Room room : rooms) {
                System.out.print(room.toString() + "|");
            }
            System.out.println();
        }
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int check() {
        int number;
        while (true) {
            String str = scanner.next();
            if (isInteger(str)) {
                number = Integer.parseInt(str);
                break;
            } else {
                System.out.println("输入有误，请重新输入: ");
            }
        }

        while (true) {
            if (number / 100 < 1 || number / 100 > 3 || number % 100 == 0 || number % 100 > 10) {
                System.out.println("房间号不存在，请输入正确的房间号");
            } else {
                break;
            }
        }
        return number;
    }

    /**
     判断给定字符串是否为整数
     @param str 待判断的字符串
     @return 若是整数，返回 true，否则返回 false
     */
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str); // 调用Integer构造方法将字符串解析为整数
            return true;
        } catch (Exception e) { // 若出现异常，则说明字符串不是整数
            return false;
        }
    }
}
