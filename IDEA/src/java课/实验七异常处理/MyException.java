package java课.实验七异常处理;

public class MyException extends Exception {

    public MyException(String message) {
        System.out.println(message);
    }
}
