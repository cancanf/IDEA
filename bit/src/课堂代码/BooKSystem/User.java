package 课堂代码.BooKSystem;

import 课堂代码.BooKSystem.operation.IOperation;

//Uer 用来做 Admin 和 NormalUser 的父类来存放两个对象的公共信息,为了使Uer不会被不小心实例化,我们将它设为抽象类.

abstract public class User {

    protected String name;

    //这个为一个接口数组,而接口是不能实例化的,所以数组中的内容为实现了该接口的实例.
    protected IOperation[] operations;

    //因为不同用户权限所能实现的操作不同,菜单内容就应该有所变化,所以此处设为抽象方法,用来在子类分别实现该用户不同的菜单
    public abstract int menu();

    //此处通过choice值对operation数组中的实例进行选择从而调用他的work方法
    public void doOperation(int choice, BookList bookList) {
        this.operations[choice - 1].work(bookList);
    }
}
