package blackhouse.java基础.异常处理.Demo03.Exception;

public class Demo01Exception {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            System.out.println(arr[4]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
