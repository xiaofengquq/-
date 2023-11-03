package zzz_InterviewQuestions;

public class InterviewQuestions06 {
    public static void main(String[] args) {
        /*
            面试题6：
            问题1：doOther()方法在执行的时候，需不需要等待doSome()方法结束
                不需要
                synchronized出现在实例方法上，表示锁this
                因为MyClass没有用synchronized修饰，因此实际执行时的对象mc，并没有收到线程锁的影响
                因此，doOther()方法在执行的时候，不需要等待doSome()方法结束
            问题2：如果在doOther()方法上加一个synchronized关键字，doOther()方法在执行的时候，需要等待doSome()方法结束吗？
                需要
                如果在 doOther() 方法上加了 synchronized 关键字，
                那么 doOther() 方法会尝试获取对象 mc 的锁，而在 doSome() 方法中已经获取了对象 mc 的锁。
                因此，doOther() 方法需要等待 doSome() 方法释放对象 mc 的锁后才能执行。
            问题3：如果在MyClass上加一个synchronized关键字，需要等待吗？
                需要
                如果在 MyClass 类上加了 synchronized 关键字，
                那么 MyClass 类的所有实例方法都将使用相同的锁，即类级别的锁。
                在这种情况下，无论是 doSome() 方法还是 doOther() 方法，都需要竞争获取 MyClass 类的锁才能执行
         */
        MyClass mc = new MyClass();
        MyThread t1 = new MyThread(mc);
        MyThread t2 = new MyThread(mc);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);//   这个睡眠的作用是为了保证t1线程先执行
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}

class MyThread extends Thread {
    private final MyClass mc;

    public MyThread(MyClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if ("t1".equals(Thread.currentThread().getName())) {
            mc.doSome();
        }
        if ("t2".equals(Thread.currentThread().getName())) {
            mc.doOther();
        }
    }
}

class MyClass {
    public synchronized void doSome() {
        System.out.println("doSome begin");
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("doSome over");
    }

    public void doOther() {
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}