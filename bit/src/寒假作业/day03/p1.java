package 寒假作业.day03;

import java.util.ArrayList;


public class p1 {
    public static void main(String[] args) {
        System.out.println(canConstruct("", "a"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        //进行ransomNote字符串的判断,如果为空那么magazine任意,都返回true
        if (ransomNote.equals("")) {
            return true;
        }
        ArrayList<String> list = new ArrayList<>();
        //将两个字符串进行分割为单个字符
        String[] mag = magazine.split("");
        String[] ran = ransomNote.split("");
        //将mag数组元素添加进list集合.
        for (int i = 0; i < mag.length; i++) {
            list.add(mag[i]);
        }
        //list集合依次对ran[i]的元素对查找存在就删除进行下一次循环,不存在就返回false;
        for (int i = 0; i < ran.length; i++) {
            if (list.contains(ran[i])) {
                list.remove(ran[i]);
            } else {
                return false;
            }
        }
        //循环结束返回true
        return true;
    }
}
