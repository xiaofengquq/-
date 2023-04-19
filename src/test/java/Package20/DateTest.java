package Package20;

//专门用于日期格式化的类
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //精确到毫秒的系统当前时间
        System.out.println(new Date());// Wed Apr 19 19:26:27 CST 2023
        /*
            yyyy    年（年是4位）
            MM      月（月是2位）
            dd      日（日是2位）
            HH      时（时是2位）
            mm      分（分是2位）
            ss      秒（秒是2位）
            SSS     毫秒（毫秒是3位）
         */
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d");
        System.out.println(sdf.format(new Date()));
    }
}
