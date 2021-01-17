package blackhouse.IO流.缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo04BuffereReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\缓冲流\\1.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
