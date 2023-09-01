package Package25.PrintStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    /**
     * 该方法用于将日志消息记录到名为 "test.log" 的文件中。
     * 日志消息包括时间戳，表示记录日志的时间，以及提供的消息内容。
     *
     * @param msg 要记录的消息内容。
     */
    public static void log(String msg) {
        try (PrintStream out = new PrintStream(
                new FileOutputStream("src/test/java/Package25/Print/test.log", true))) {
            // 重定向标准输出流到指定的 PrintStream 以实现日志记录
            System.setOut(out);

            // 创建 SimpleDateFormat 实例以格式化时间戳
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS EEE");

            // 获取当前日期和时间，并使用 SimpleDateFormat 进行格式化
            String nowTime = sdf.format(new Date());

            // 将格式化的日志条目写入输出流
            out.println(nowTime + ": " + msg);
        } catch (IOException e) {
            // 处理文件 I/O 发生的异常
            e.printStackTrace();
        }
    }
}
