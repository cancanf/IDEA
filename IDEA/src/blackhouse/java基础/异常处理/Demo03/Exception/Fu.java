package blackhouse.java基础.异常处理.Demo03.Exception;

public class Fu {

    public void show01() throws NullPointerException, ClassCastException {
    }

    public void show02() throws IndexOutOfBoundsException {
    }

    public void show03() throws IndexOutOfBoundsException {
    }

    public void show04() {
    }
}

class Zi extends Fu {
    public void show01() throws NullPointerException {
        //子类重写父类方法的时候,抛出和父类相同的异常
    }

    public void show02() throws ArrayIndexOutOfBoundsException {
        //子类重写父类方法的时候,抛出父类异常的子类
    }

    public void show03() {
        //父类重写子类方法时,不抛出异常.
    }

    //父类方法没有抛出异常,子类重写父类方法时也不能抛出异常
    //public void show04() throws Exception{}
    public void show04() {
        try {
            throw new Exception("编译器异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
