package Package13;

public class FinalizeTest {
    @Override
    protected void finalize() throws Throwable {
        //  JVM垃圾回收器
        super.finalize();
    }

    //finalize方法源码
//    protected void finalize() throws Throwable {
//
//    }
}

