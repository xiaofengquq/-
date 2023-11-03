package Homework.TicketSellingSystem;

public class TicketSellingSystemTest {
    public static void main(String[] args) {
        Customer[] c = new Customer[100];
        for (int i = 1; i <= 100; i++) {
            c[i - 1] = new Customer("a" + i);
        }
        TicketSellingSystem t = new TicketSellingSystem(c);
        Sail s1 = new Sail(t);
        Sail s2 = new Sail(t);
        s1.start();
        s2.start();
    }
}
