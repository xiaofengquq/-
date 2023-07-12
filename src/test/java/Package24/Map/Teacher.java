package Package24.Map;

public class Teacher {
    String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //  重写equals() 和 hashCode()方法

    @Override
    public int hashCode() {
        return 1;
    }


//    public boolean equals(Student s) {
//        if (this.name == null) {
//            return s.name == null;
//        } else
//            return this.name.equals(s.name);
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            if (this.name == null) {
                return ((Teacher) obj).name == null;
            } else
                return this.name.equals(((Teacher) obj).name);
        } else {
            return false;
        }
    }
}
