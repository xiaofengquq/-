package Package13;

public class EqualsTest {
    public static void main(String[] args) {
        MyTime01 time1 = new MyTime01(2023, 3, 9);
        MyTime01 time2 = new MyTime01(2023, 3, 9);
        MyTime01 time3 = new MyTime01(2023, 4, 8);
        System.out.println(time1.equals(time2));
        System.out.println(time1.equals(time3));
        System.out.println(time1.equals(new Object()));
        System.out.println(time1.equals(null));
    }

    /**
     * 关于Object类中的equals方法
     *  1、源码
     *     public boolean equals(Object obj) {
     *         return (this == obj);
     *     }
     *  2、可以用来判断两个对象是否相等
     *  3、Object类中的equals方法，使用“==”来比较，比较的是两个对象的内存地址是否相等，因此是
     *      【不够用】的!
     *
     * */

}

class MyTime01 {
    private int year;
    private int month;
    private int day;

    public MyTime01(int year, int month, int day) {
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

    @Override
    //对于MyTime01这类来说，两个对象相等可以通过比较年月日是否相等来判断，因此重写equals方法以满足需求
    public boolean equals(Object obj) {
        if (obj instanceof MyTime01) {
            return ((MyTime01) obj).year == year && ((MyTime01) obj).month == month && ((MyTime01) obj).day == day;
        }
        return false;
    }

    //idea自动生成的equals方法

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyTime01 myTime01 = (MyTime01) o;
//        return year == myTime01.year &&
//                month == myTime01.month &&
//                day == myTime01.day;
//    }

}