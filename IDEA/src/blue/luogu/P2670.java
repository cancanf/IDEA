package blue.luogu;

import java.util.Scanner;

public class P2670 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        //设定扫雷地图是n乘m的
        n = in.nextInt();
        m = in.nextInt();
        //创建二维数组当做地图
        char[][] ditu = new char[n][m];

        for (int i = 0; i < n; i++) {
            char[] chars = in.next().toCharArray();//创建临时数组读取一行字符串转为char数组
            for (int j = 0; j < m; j++) {
                ditu[i][j] = chars[j];//对应赋值
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {//遍历地图上的每个点
                int sum = 0;//计数

                if (ditu[x][y] == '?') {//只计算?的点
                    //八连通循环,用dx和x,dy和y进行角标的变化.
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            int nx = dx + x, ny = dy + y;//简化变量
                            if (0 <= nx && nx < n && 0 <= ny && ny < m && ditu[nx][ny] == '*') {//控制nx,ny的点在地图里面
                                sum++;
                            }
                        }
                    }
                    ditu[x][y] = (char) (sum + '0');//转换int类型为char类型
                }
                System.out.print(ditu[x][y]);//进行输出
            }
            System.out.println();//控制换行
        }


    }
}
