package Package01;

public class ChineseTest {
    public static void main(String[] args) {
        Chinese chinese1 = new Chinese();
        System.out.println("id = " + chinese1.id + ", " + "name = " + chinese1.name
                + ", " + "country = " + Chinese.country);
        Chinese chinese2 = new Chinese("小风", "9153");
        System.out.println("id = " + chinese2.id + ", " + "name = " + chinese2.name
                + ", " + "country = " + Chinese.country);
    }
}
