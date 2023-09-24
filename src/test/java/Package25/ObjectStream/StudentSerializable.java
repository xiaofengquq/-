package Package25.ObjectStream;

import java.io.Serializable;

public class StudentSerializable implements Serializable {

    //  java虚拟机看到Serializable接口后，会自动生成一个序列化版本号（最终结论，手动写序列化版本号）

    private static final long serialVersionUID = 694793672694793672L;
    private int age;
    private String name;

    //  新增一个变量
    private int no;

    //  过了很久之后，Student这个类源代码改动了。
    //  源代码改动之后，需要重新编译，编译之后生成全新的字节码文件。
    //  并且class文件再次运行的时候，java虚拟机生成的序列化版本号也会发生相应的改变
    @Override
    public String toString() {
        return "Student[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ']';
    }

    public StudentSerializable() {
    }

    public StudentSerializable(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
