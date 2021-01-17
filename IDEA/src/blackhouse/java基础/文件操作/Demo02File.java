package blackhouse.java基础.文件操作;


import java.io.File;

/**
 * 路径:
 * 绝对路径:是- -个完整的路径
 * 以盘符(c:, D: )开始的路径
 * C: lla. txt
 * C:\\Users \itcast\ \IdeaProjects \ \shungyuan\1123. txt
 * D:\\demo\\b. txt
 * 相对路径:是- -个简化的路径
 * 相对指的是相对于当前项目的根目录(C: \ \Users \itcast\ \IdeaProjects \ \shungyuan)
 * 如果使用当前项目的根目录，路径可以简化书写
 * C:\\Users \itcast \ \IdeaProjects\ \shungyuan\\123. txt-->简化为: 123. txt(可以省略项目的根目录)
 * 注意:
 * 1.路径是不区分大小写
 * 2.路径中的文件名称分隔符windows使用反斜杠,反斜杠是转义字符,两个反斜杠代表-个普通的反斜杠
 */
public class Demo02File {
    public static void main(String[] args) {
        show01();
        show02("c:", "a.txt");
    }

    /**
     * File(String) parent , String child)根据路径名字符串和 child路径名字符串创建一个新的File实例
     * 参数:把路径分成了两部分
     * String parent 父路径
     * String child 子路径
     * 两个路径可以单独书写,使用起来非常灵活,父路径和子路径都能变化
     */
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /**
     * File(String pathname)通过将绐定路径名字符串转换为抽象路径名来创建一个新File 实例。
     * 参数:
     * String pathname :字符串的路径名称
     * 路径可以是以文件结尾，也可以是以文件夹结尾
     * 路径可以是相对路径,也可以是绝对路径
     * 路径可以是存在,也可以是不存在
     * 创建File对象,只是把字符串路径封装为File对象,不考虑路径的真假情况
     **/
    private static void show01() {
        File f1 = new File("D:\\Desktop");
        System.out.println(f1);
    }
}
