package 课堂代码.数据结构.课件练习.二叉树.进阶题.分层遍历;

import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> result;

    public static List<List<Integer>> levelOrder(TreeNode root) {
        result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        cengadd(root, 0);
        return result;
    }

    private static void cengadd(TreeNode root, int index) {
        if (index == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(index).add(root.val);
        if (root.left != null) {
            cengadd(root.left, index + 1);
        }
        if (root.right != null) {
            cengadd(root.right, index + 1);
        }
    }
}
