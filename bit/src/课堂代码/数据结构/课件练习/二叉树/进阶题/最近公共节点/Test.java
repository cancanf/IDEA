package 课堂代码.数据结构.课件练习.二叉树.进阶题.最近公共节点;

import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

public class Test {
    public static void main(String[] args) {

    }

    static TreeNode lca = null;

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        dfs(root, p, q);
        return lca;

    }

    private static boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }

        int mid = (root == p || root == q) ? 1 : 0;
        int leftok = dfs(root.left, p, q) ? 1 : 0;
        int rightok = dfs(root.right, p, q) ? 1 : 0;
        if (mid + leftok + rightok == 2) {
            lca = root;
        }

        return (mid + leftok + rightok) > 0;
    }
}
