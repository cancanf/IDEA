package 课堂代码.课后作业.面向对象编程;

class Base {

    Base() {

        System.out.print("Base");

    }

}

public class Alpha extends Base {

    public static void main(String[] args) {

        new Alpha();

        //调用父类无参的构造方法

        new Base();

    }

}
//class A{
//
//}
//class B extends A{
//
//}
//class C extends B{
//
//}
//public class extend {
//    public static void main(String[] args) {
//         A a0=new A();
//        A a1=new B();
//        A a2=new C();
//    }
//}
