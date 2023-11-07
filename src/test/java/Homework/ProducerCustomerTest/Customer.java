package Homework.ProducerCustomerTest;

import java.util.LinkedList;

public class Customer extends Thread {
    final LinkedList<Object> container;

    public Customer(LinkedList<Object> container) {
        this.container = container;
    }

    @Override
    public void run() {
        synchronized (container) {
            while (true) {
                // 检查容器是否为空
                while (container.isEmpty()) {
                    container.notify();  // 通知等待中的生产者线程可以生产
                    try {
                        container.wait();  // 消费者线程等待，直到有可消费的单位
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                container.removeFirst();  // 从容器中移除一个单位，表示消费
                System.out.println("消费者消费1个单位，剩余数量：" + container.size());
                try {
                    sleep(100);  // 模拟消费过程
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
