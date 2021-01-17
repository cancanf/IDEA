package blackhouse.IO流.转换流.序列化.序列化集合;

import java.io.*;
import java.util.ArrayList;

public class Demo03Text {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("儿子", 18));
        list.add(new Person("孙子", 17));
        list.add(new Person("重孙", 16));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\转换流\\序列化\\序列化集合\\Person.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\转换流\\序列化\\序列化集合\\Person.txt"));

        oos.writeObject(list);
        Object o = ois.readObject();
        ArrayList<Person> list2 = (ArrayList<Person>) o;
        ois.close();
        oos.close();
        for (Person p : list2) {
            System.out.println(p);
        }
    }
}
