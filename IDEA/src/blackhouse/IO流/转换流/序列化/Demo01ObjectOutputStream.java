package blackhouse.IO流.转换流.序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\转换流\\序列化\\person.txt"));
        oos.writeObject(new Person("你好", 15));
        oos.close();
    }

}
