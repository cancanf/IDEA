package 寒假作业.day13;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] a[] = new int[6][6];
        subsets(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();

        dfs(nums, len, 0, res, path);

        return res;

    }

    private static void dfs(int[] nums, int len, int level, List<List<Integer>> res, Deque<Integer> path) {
        if (level == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        dfs(nums, len, level + 1, res, path);//不选当前数；
        //选当前数；
        path.add(nums[level]);
        dfs(nums, len, level + 1, res, path);
        path.removeLast();
    }

}
