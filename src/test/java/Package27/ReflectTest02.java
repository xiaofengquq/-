package Package27;

/*
    获取到Class，能干什么？
        通过Class的newInstance()方法来实例化对象
    注意：newInstance()方法内部实际上调用了无参构造方法，必须保证无参构造方法存在才可以
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        User u = new User();
        //  通过反射机制，获取Class，通过Class来实例化对象
        Class c1 = User.class;
        Class c2 = u.getClass();
        Class c3;
        try {
            c3 = Class.forName("src/test/java/Package27/User/User.java");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            //  newInstance() 这个方法会调用User这个类的无参构造方法，完成对象的创建
            User u1 = (User) c1.newInstance();
            User u2 = (User) c2.newInstance();
            User u3 = (User) c3.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
