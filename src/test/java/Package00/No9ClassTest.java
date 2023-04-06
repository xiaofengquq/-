package Package00;

public class No9ClassTest {

    private String colour;
    private String brand;
    private String size;

    public No9ClassTest(String colour, String brand, String size) {
        this.colour = colour;
        this.brand = brand;
        this.size = size;
    }

    public No9ClassTest() {

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void main(String[] args) {
        No9ClassTest television = new No9ClassTest("red", "TCL", "26");
        System.out.println("电视品牌是：" + television.getBrand());
        System.out.println("电视颜色是：" + television.getColour());
        television.setColour("black");
        System.out.println("电视颜色是：" + television.getColour());
    }

}
