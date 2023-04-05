package Package08;

public class Customer {
    public static void main(String[] args) {
        new Customer().order(new AmericanCook());
        new Customer().order(new ChineseCook());
    }
    /**
     * 顾客手里有一个菜单
     * Customer has a menu;
     * 【凡是能够使用 has a 来描述的，统一以属性的方式存在】
     * */
    FoodMenu fm;

    public FoodMenu getFoodMenu() {
        return fm;
    }

    public void setFoodMenu(FoodMenu fm) {
        this.fm = fm;
    }

    public void order(FoodMenu fm) {
        this.fm = fm;
        //也可以不调用get方法，私有属性在本类中是可以访问的
//        FoodMenu fm = foodMenu;
        fm.yuXiangRouSi();
        fm.xiHongShiChaoJiDan();
    }
}
