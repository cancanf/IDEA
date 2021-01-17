package blackhouse.java基础.异常处理.Demo01.Exception;

public class Demo03Throw {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        getElement(arr, 10);
    }

    public static int getElement(int[] arr, int intdex) {
        if (arr == null) {
            throw new NullPointerException("传递的数组的值为空");
        }
        if (intdex < 0 || intdex > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组越级");
        }
        int ele = arr[intdex];
        return ele;
    }
}
