package Package26;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
    使用定时器指定定时任务的示例
 */

public class TimerTest01 {
    public static void main(String[] args) {
        // 创建一个 Timer 对象，用于执行定时任务
        Timer t = new Timer();

        // 使用 Timer 对象调度一个 TimerTask，在指定的时间间隔执行任务
        t.schedule(new TimerTask() {
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");

            @Override
            public void run() {
                // 在定时任务执行时，获取当前时间并格式化为字符串
                String strTime = sdf.format(new Date());
                // 输出备份成功信息，附带当前时间
                System.out.println(strTime + "备份成功");
            }
        }, new Date(), 1000);
    }
}
