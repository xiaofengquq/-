package Package13;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ToStringTest {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        //输出引用的时候，会自动调用该引用指向类的toString方法
        System.out.println(mapper);
        MyTime time = new MyTime(2023, 3, 29);
        //调用重写后的toString方法打印
        System.out.println(time.toString());
    }
}

class MyTime {
    private int year;
    private int month;
    private int day;

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override//重写继承自Object类中的toString方法
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
