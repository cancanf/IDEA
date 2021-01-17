package blue.蓝桥;

public class 叶节点 {
    public static void main(String[] args) {
        int sum = 1, jie = 2;
        while (sum < 2019) {
            jie = jie * 2;
            sum = sum + jie;
        }
        if (sum > 2019) {
            sum = sum - jie;
        }
        System.out.println(jie);
        System.out.println(sum);
    }
}
