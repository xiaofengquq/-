public class No1SwitchTest {
    public static void main(String[] args) {
        System.out.println(level(50.5));;
    }

    public static String level(double score) {
        //[90-100] A
        //[80-90)  B
        //[70-80)  C
        //[60-70)  D
        //[0-60)   E
        switch ((int) (score / 10)) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "E";
        }
    }
}
