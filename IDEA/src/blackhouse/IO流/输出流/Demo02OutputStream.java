package blackhouse.IO流.输出流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\2.txt");
        //如果写入的第一个字节是正数(0-127),那么现实的时候会查询ASCII码表
        //如果写的第一个字节是负数,那么第一个字节回合第二个字节组合形成中文,并查询系统默认码表
        byte[] btes = {65, 66, 67, 68, 69};
        fos.write(49);
        fos.write(48);
        fos.write(48);
        fos.write(btes, 1, 2);
        byte[] byteString = "你好".getBytes();
        System.out.println(Arrays.toString(byteString));
        fos.write(byteString);
        fos.close();
    }
}
