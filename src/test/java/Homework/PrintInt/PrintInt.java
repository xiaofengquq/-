package Homework.PrintInt;

public class PrintInt {
    public static void main(String[] args) {
        int max = 10000;
        Number[] numbers = new Number[max];
        for (int i = 1; i <= max; i++) {
            numbers[i - 1] = new Number(i);
        }
        Thread t = new Thread(new TestThread(numbers, max));
        t.start();
        for (int i = 0; i < max; i++) {
            synchronized (numbers[i]) {
                if (!numbers[i].isPrinted()) {
                    System.out.println(Thread.currentThread().getName() + "打印" + numbers[i].getI());
                    numbers[i].setPrinted(true);
                }
            }
        }
    }
}

class TestThread implements Runnable {
    Number[] numbers;
    int max;

    public TestThread(Number[] numbers, int max) {
        this.numbers = numbers;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            synchronized (numbers[i]) {
                if (!numbers[i].isPrinted()) {
                    System.out.println(Thread.currentThread().getName() + "打印" + numbers[i].getI());
                    numbers[i].setPrinted(true);
                }
            }
        }
    }
}
