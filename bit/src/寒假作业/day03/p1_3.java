package 寒假作业.day03;

public class p1_3 {
    //字典法
    public boolean canConstruct(String ransomNote, String magazine) {
        //使用字典进行操作
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        //数组默认全部初始化为0,不需要手动初始化
        int[] word = new int[26];
        //对mag遍历对其中字符数量进行计数
        for (char c :
                mag) {
            word[c - 'a']++;
        }
        //对ran遍历依次减一,当为负数是反映情况不满足
        for (char c :
                ran) {
            int temp = --word[c - 'a'];
            if (temp < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        p1_3 p1 = new p1_3();
        p1.canConstruct("", "abbb");
    }
}
