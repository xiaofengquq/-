package Homework.ProducerCustomerTest;

import java.util.LinkedList;
import java.util.concurrent.FutureTask;

public class ProducerCustomerTest {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Object> container = new LinkedList<>();
        FutureTask<Object> futureTask = new FutureTask<>(new Producer(container, CAPACITY));
        Thread producerThread = new Thread(futureTask);
        Thread customerThread = new Customer(container);
        producerThread.start();
        customerThread.start();
    }
}
