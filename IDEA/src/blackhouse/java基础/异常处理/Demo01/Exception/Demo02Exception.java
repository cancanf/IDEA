package blackhouse.java基础.异常处理.Demo01.Exception;

public class Demo02Exception {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int e = getElement(arr, 3);
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
//        at 黑马课程.java基础.异常处理.Demo01.Exception.Demo02Exception.getElement(Demo02Exception.java:11)
//        at 黑马课程.java基础.异常处理.Demo01.Exception.Demo02Exception.main(Demo02Exception.java:7)
//        System.out.println(e);
    }

    public static int getElement(int[] arr, int index) {
        int ele = arr[index];
        return ele;
    }
}
