package 寒假作业.day03;

public class p1_2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        //使用StringBuffer进行效率的优化,并添加两个特殊情况的判断
        StringBuffer magBuffer = new StringBuffer(magazine);
        if (ransomNote.equals("")) {
            return true;
        }
        //ransomNote长度大于magazine时必定不满足条件
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        /*foreach遍历ransomNote的每一个字符并且在magBuffer集合里面查找并返回位置
        不存在的情况返回-1,存在的情况将其删除.
        * */
        for (char c :
                ransomNote.toCharArray()) {
            int index = magBuffer.indexOf(String.valueOf(c));
            if (index < 0) {
                return false;
            } else {
                magBuffer.deleteCharAt(index);
            }
        }
        return true;
    }
}
