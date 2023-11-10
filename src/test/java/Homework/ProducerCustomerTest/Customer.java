package Homework.ProducerCustomerTest;

import java.util.LinkedList;

/*
    1、使用wait()方法和notify()方法实现“生产者和消费者模式”
    2、什么是“生产者和消费者模式”？
        生产线程负责生产，消费线程负责消费。
        生产线程和消费线程要达到均衡。
        这是一种特殊的业务需求，在这种特殊的情况下需要使用wait()方法和notify()
    3、使用wait()方法和notify()不是线程对象的方法，而是普通java对象都有的方法
    4、使用wait()方法和notify()建立在线程同步的基础上。因为多线程操作一个仓库，有线程安全问题
    5、wait()方法作用：o.wait()让正在o对象上获取的线程t进入等待状态，并且释放掉t线程之前占有o对象的锁
    6、notify()方法作用：o.notify()唤醒正在o对象上等待的线程，只是通知，不会释放o对象之前占有的锁
 */

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
                if (container.isEmpty()) {
                    try {
                        //  如果容器为空，则消费者释放锁，等待生产者生产
                        container.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //  代码走到这，说明容器还有剩余单位，可以进行消费
                container.removeFirst();  // 从容器中移除一个单位，表示消费
                System.out.println("消费者消费1个单位，剩余数量：" + container.size());
                try {
                    sleep(100);  // 模拟消费过程
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                container.notify();  // 通知等待中的生产者线程可以生产
            }
        }
    }
}
