package Package20;

import java.text.ParseException;
//  专门用于日期格式化的类
//  总结：SimpleDateFormat类，
//      可以将Date转换为String（new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS EEE").format(Date)
//      也可以将String转换为Date（new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS EEE").parse(String)
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        //精确到毫秒的系统当前时间
        System.out.println("系统当前时间（精确到毫秒）：" + new Date());// Wed Apr 19 19:26:27 CST 2023
        /*
            yyyy    年（年是4位）     例如2023
            MM      月（月是2位）     例如10
            dd      日（日是2位）     例如09
            HH      24小时制
            hh      12小时制（时是2位）
            mm      分（分是2位）
            ss      秒（秒是2位）
            SSS     毫秒（毫秒是3位）
            EEE     星期（星期是3位）   例如星期一
            u       星期的数字（星期的数字是1位）
            a       代表上午下午，一般与h（即12小时制）连用
         */

        //  如果定义SimpleDateFormat时不传递pattern参数，日期时间格式将根据计算机的区域设置以及语言来确定
        //  当前计算机区域设置及语言设置情况下，默认的日期格式为 23-10-9 上午10:45
        //  对应的pattern为 "yy-MM-d ah:m"
        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf_with_default_pattern = new SimpleDateFormat("yy-MM-d ah:m");
        System.out.println("默认日期格式：" + sdf.format(new Date()));
        System.out.println("使用默认pattern日期格式：" + sdf_with_default_pattern.format(new Date()));

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS EEE");
        //  SimpleDateFormat里有个format()，传递一个Date进去，会返回一个String
        System.out.println(sdf1.format(new Date()));

        //  假设现在有一个日期字符串String，怎么转换成Date类型？
        String time = "2023-04-20 19:46:04 315 星期四";
        //  这里的pattern要和上面String的time格式相同
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS EEE");
        //  parse方法需要抛出ParseException
        Date date = sdf2.parse(time);
        //  输出由String转换而来的Date
        System.out.println(date);
    }
}
