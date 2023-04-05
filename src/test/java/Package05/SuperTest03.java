package Package05;

/**
 * 1、在恰当的时间使用:super(实际参数列表)
 *
 * 2、注意：在构造方法执行过程中一连串调用了父类的构造方法，
 * 父类的构造方法又继续向下调用了它的父类的构造方法，但是实际上对象只创建了一个
 *
 * 3、思考："super(实参)"到底是干啥的？
 *      super(实参)的作用是：初始化当前对象的父类型特征。
 *      并不是创建新对象。实际上对象只创建了一个
 *
 * 4、super关键字代表的是什么？
 *      super关键字代表的是“当前对象”的那部分父类型特征
 */
public class SuperTest03 {
    public static void main(String[] args) {
        CreditAccount c = new CreditAccount("No1", 1.0, 0.99);
        System.out.println(c.getActNo());
    }
}

class Account {
    private String actNo;
    private double balance;

    public Account() {
    }

    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CreditAccount extends Account {
    private double credit;

    public CreditAccount() {
    }

    public CreditAccount(String actNo, double balance, double credit) {
        //actNo、balance是私有属性，不能继承
//        this.actNo = actNo;
//        this.balance = balance;
        super(actNo, balance);//通过子类的构造方法调用父类的构造方法

        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
