package Package20;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest02 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date d = new Date(1);
        System.out.println(sdf.format(d));
        //  1970-01-01 08-00-00 001
        //  北京是东八区，差8个小时
        //  获取昨天此时的时间
        //      当前时间 System.currentTimeMillis()
        //      减去一天的毫秒数 86400000，将这个数字传参创建一个Date对象
        System.out.println(sdf.format
                (new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24)));
        //  获取去年的今天的时间(这里必须使用long类型来计算，因为一年的毫秒数已经超过了int最大值)
        System.out.println(sdf.format(new Date(System.currentTimeMillis() - 1000L * 60 * 60 * 24 * 365)));
    }
}
