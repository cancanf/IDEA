package blackhouse.IO流.转换流.序列化;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("控制台输出");
        PrintStream ps = new PrintStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\转换流\\3.txt");
        System.setOut(ps);
        System.out.println("在哪里打印?");
    }
}
