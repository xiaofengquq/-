package Package23;

/*
    重写之后的方法不能比重写之前的抛出更多（更宽泛）的异常，可以更少
 */
public class ExceptionTest13 {
    public static void main(String[] args) {

    }
}

class Animal {
    public void doSome() {

    }

    public void doOther() throws RuntimeException {

    }
}

class Cat extends Animal {
//    @Override
//    public void doSome() throws Exception {
//        super.doSome();
//    }
//    原因："Package23.Cat中的doSome()方法与Package23.Animal中的doSome()方法冲突；覆盖的方法没有抛出java.lang.Exception异常。"
//    实际原因：子类方法只能抛出 父类方法抛出的异常或其子类

    @Override
    public void doOther() throws RuntimeException {
        super.doOther();
    }
}