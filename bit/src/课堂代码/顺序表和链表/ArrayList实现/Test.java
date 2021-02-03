package 课堂代码.顺序表和链表.ArrayList实现;

public class Test {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("c");
        list.add("c++");
        list.add("c#");
        list.add("java");
        list.add("php");
        list.add(2, "shell");
        System.out.print("所有的元素有:");
        System.out.println(list.toString());
        list.remove(0);
        list.remove("c++");
        System.out.println("删除 0号元素 和 \"c++\" ");
        System.out.println(list.toString());
        System.out.println("第一位元素为");
        System.out.println(list.get(1));
        list.set(1, "ok");
        System.out.println("修改下标为1的元素为\"ok\"");
        System.out.println(list.toString());
        System.out.println("查找是否有\"java\"元素");
        System.out.println(list.contains("java"));
        System.out.println("查找\"java\"元素位置");
        System.out.println(list.indexOf("java"));
        System.out.println("倒着查找\"c#元素位置\"");
        System.out.println(list.lastIndexOf("c#"));

    }
}
