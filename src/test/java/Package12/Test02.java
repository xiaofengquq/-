package Package12;

/**
 * 2、请定义一个交通工具(vehicle) 的类
 * 其中有属性:
 * 速度(speed)
 * 体积(size)等等
 * 方法移动(move ())
 * 设置速度(setSpeed(int speed))
 * 加速speedup()
 * 减速speedDown()等等
 * 最后在测试类vehicle中的main() 中实例化一个交通工具对象,
 * 并通过方法给它初始化speed,size的值并且打印出来。
 * 另外调用加速减速的方法对速度进行改变。
 */
public class Test02 {
}

class Vehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(100, 59);
        System.out.println("交通工具的速度为: " + v.speed);
        System.out.println("交通工具的大小为: " + v.size);
        v.speedup(40);
        v.speedDown(29);
    }

    public Vehicle(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    double speed;
    double size;

    public void move() {

    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void speedup(int i) {
        speed += i;
        System.out.println("加速 " + i + " 后交通工具的速度为" + speed);
    }

    public void speedDown(int i) {
        speed -= i;
        System.out.println("减速 " + i + " 后交通工具的速度为" + speed);
    }
}