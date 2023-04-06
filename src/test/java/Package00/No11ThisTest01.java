package Package00;

public class No11ThisTest01 {
    private int year;
    private int month;
    private int day;

    public No11ThisTest01() {
        this(1970, 1, 1);
    }
/*
      通过this，可以实现无参构造调用有参构造方法，且不会生成多余的对象
      （如果使用new Package00.No11ThisTest01(year, month, day)的方式来调用会生成多余的对象


    this可以用在哪里:
        1、可以使用在实例方法当中，代表当前对象[语法格式: this.]

        2、可以使用在构造方法当中，通过当前的构造方法调用其它的构造方法[语法格式: this(实参);]
    this()这中语法只能出现在构造方法的第一行
*/

    public No11ThisTest01(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
