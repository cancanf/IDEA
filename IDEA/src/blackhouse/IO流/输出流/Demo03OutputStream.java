package blackhouse.IO流.输出流;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\3.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好\n".getBytes());
        }
        fos.close();
    }
}
