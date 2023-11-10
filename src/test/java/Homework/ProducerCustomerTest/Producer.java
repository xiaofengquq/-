package Homework.ProducerCustomerTest;

import java.util.LinkedList;
import java.util.concurrent.Callable;

public class Producer implements Callable<Object> {
    final LinkedList<Object> container;
    int capacity;

    public Producer(LinkedList<Object> container, int capacity) {
        this.container = container;
        this.capacity = capacity;
    }

    @Override
    public Void call() {
        synchronized (container) {
            while (true) {
                // 检查容器是否已满
                if (container.size() >= capacity) {
                    try {
                        //  如果容器满了，则生产者释放锁，等待消费者消费
                        container.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //  代码走到这，说明容器没满，可以进行生产
                container.add(new Object());  // 生产一个单位并将其添加到容器中
                System.out.println("生产者生产1个单位，当前数量：" + container.size());
                try {
                    Thread.sleep(100);  // 模拟生产过程
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                container.notify();  // 通知等待中的消费者线程可以消费
            }
        }
    }
}
