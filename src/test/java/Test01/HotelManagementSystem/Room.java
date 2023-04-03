package Test01.HotelManagementSystem;

public class Room {
    private int number;
    private String type;
    private boolean isEmpty = true;

    public Room(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    //println输出一个引用，会自动调用toString()方法
    public String toString() {
        return number +
                ", " + type +
                ", " + (isEmpty ? "空闲" : "占用") +  " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return number == room.number;
    }
}
