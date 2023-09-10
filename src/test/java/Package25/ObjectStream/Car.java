package Package25.ObjectStream;

import java.io.Serializable;

public class Car implements Serializable {
    private String colour;
    private int topSpeed;

    //  transient关键字表示游离的，该变量不参与序列化
    private transient String notInSerialization;

    public Car() {
    }

    public Car(String colour, int topSpeed, String notInSerialization) {
        this.colour = colour;
        this.topSpeed = topSpeed;
        this.notInSerialization = notInSerialization;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getNotInSerialization() {
        return notInSerialization;
    }

    public void setNotInSerialization(String notInSerialization) {
        this.notInSerialization = notInSerialization;
    }

    @Override
    public String toString() {
        return "Car[" +
                "colour='" + colour + '\'' +
                ", topSpeed=" + topSpeed +
                ", notInSerialization='" + notInSerialization + '\'' +
                ']';
    }
}
