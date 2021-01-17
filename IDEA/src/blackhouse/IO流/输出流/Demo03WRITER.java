package blackhouse.IO流.输出流;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03WRITER {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\输出流\\1.txt", true);
        char[] cs = {'a', 'b', 'c', 'd'};
        fw.write(cs);
        fw.write(cs, 1, 3);
        fw.write("\n行啊");
        //换行符会占用一个位置
        fw.write("nis\nhi", 2, 3);
        fw.close();
    }
}
