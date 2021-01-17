package blackhouse.IO流.缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BUfferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\缓冲流\\1.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("erhuo");
            bw.newLine();
        }
        bw.close();
    }
}
