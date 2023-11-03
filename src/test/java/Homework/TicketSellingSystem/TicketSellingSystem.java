package Homework.TicketSellingSystem;

import java.util.Objects;
import java.util.Random;

/*
    写一个程序模拟100人买票
        要求100个人每人一张票，不能多卖，也不能少卖
 */

public class TicketSellingSystem {
    int ticketsNo = 100;

    Customer[] customers;

    public TicketSellingSystem(Customer[] customers) {
        this.customers = customers;
    }

    public void buyTicket(Customer c) {
        synchronized (this) {
            if (ticketsNo > 0 && Objects.isNull(c.getTicket())) {
                ticketsNo--;
                Random random = new Random();
                c.setTicket(new Ticket(random.nextInt()));
                System.out.println("用户 " + c.getName() + "已买到车票，剩余车票数：" + ticketsNo);
            } else {
                System.out.println("票已售罄或" + c.getName() + "已买到票");
            }
        }
    }
}

class Sail extends Thread {
    TicketSellingSystem t;

    public Sail(TicketSellingSystem t) {
        this.t = t;
    }

    @Override
    public void run() {
        for (Customer c : t.customers) {
            t.buyTicket(c);
        }
    }
}
