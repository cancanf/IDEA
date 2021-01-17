package blackhouse.IO流.转换流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\转换流\\3.txt");
        printStream.write(97);
        printStream.println(97);
        printStream.close();
    }
}
