package Package15;

import java.util.Arrays;

public class TwoDArrayTest {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3};
        int[] ints1 = new int[]{4, 5, 6};
        int[] ints2 = new int[]{7, 8, 9};
        int[][] ints3 = new int[][]{ints, ints1, ints2};
        for (int[] i : ints3) {
            System.out.println(Arrays.toString(i));
        }
    }
}
