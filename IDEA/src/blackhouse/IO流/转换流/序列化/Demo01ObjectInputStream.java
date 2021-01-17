package blackhouse.IO流.转换流.序列化;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo01ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\转换流\\序列化\\person.txt"));

        Object o = ois.readObject();
        ois.close();
        System.out.println(o);


    }
}
