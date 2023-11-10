package Homework.PrintInt;

public class AlternateNumberPrinter {
    public static void main(String[] args) {
        /*
            在Java中，基本数据类型（如int）是值类型，而不是引用类型。
                当在一个线程中对基本数据类型的值进行修改时，其他线程无法感知到这个变化，因为它们只是复制了这个值。

            在并发编程中，为了实现线程间的安全通信，通常需要共享一个可变对象，而不是一个基本数据类型。
            Integer虽然不是一个值，但它是一个不可变的类，因此不能直接修改其值。
            为了在多线程环境中实现共享的可变状态，可以使用数组或其他可变对象。
         */
        final Integer[] integers = {1};  //  以上为使用Integer[]的原因
        final Object lock = new Object();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                while (integers[0] <= 99) {
                    synchronized (lock) {
                        System.out.println(Thread.currentThread().getName() + " ---> " + integers[0]++);
                        lock.notify();
                        if (integers[0] < 100) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }

        });
        t1.setName("奇数线程");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (integers[0] <= 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (lock) {
                        System.out.println(Thread.currentThread().getName() + " ---> " + integers[0]++);
                        lock.notify();
                        if (integers[0] < 100) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        });
        t2.setName("偶数线程");

        t1.start();
        t2.start();
    }
}