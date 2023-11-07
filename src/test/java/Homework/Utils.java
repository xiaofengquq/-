package Homework;

public class Utils {
    public static boolean isAllNull(Object[] array) {
        if (array == null) {
            return true;
        }
        for (Object o : array) {
            if (o != null) {
                return false;
            }
        }
        return true;
    }

    public static int countNonNullElements(Object[] array) {
        int count = 0;
        for (Object o : array) {
            if (o != null) {
                count++;
            }
        }
        return count;
    }
}
