package Package13;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        User user = new User(null, null);
        System.out.println(new User(null, null).equals(user));
    }
}

class User {
    private Address address;
    private String name;

    public User() {
    }

    public User(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    //重写equals方法
    //重写规则：当一个用户的用户名和家庭住址都相同，则代表同一个用户

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof User))  {
//            return false;
//        }
//        if (obj == this) {
//            return true;
//        }
//        return ((User) obj).address.equals(this.address) &&
//                ((User) obj).name.equals(this.name);
//    }

    //equals()方法一定要重写彻底
    //User类中有String name和Address address，不光要比较name之间相不相等，还要比较Address类中的属性相不相等，
    //因此还需要重写Address类中的equals方法
    //  【equals()方法重写要彻底！】
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(address, user.address) &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, name);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Address {
    String city;
    String street;
    String zipCode;

    public Address() {
    }

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(zipCode, address.zipCode);
    }
}
