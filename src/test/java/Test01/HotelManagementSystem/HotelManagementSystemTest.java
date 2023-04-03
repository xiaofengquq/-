package Test01.HotelManagementSystem;

import java.util.Scanner;

public class HotelManagementSystemTest {
    public static void main(String[] args) {
        HotelManagementSystem system = new HotelManagementSystem();
//        System.out.println(system.hotel.getRooms()[0][0]);
//        int number = new Scanner(System.in).nextInt();
        system.reserve();
        system.checkOut();
//        system.checkOut(202);
//        system.print();
    }
}
