package 课堂代码.数据结构.课件练习.二叉树.进阶题.创建字符串;

import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

public class Treestr {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        a.left = b;
        a.right = c;
        b.right = d;
        c.left = e;
        c.right = f;
        System.out.println(tree2str(a));

    }

    public static StringBuilder builder = new StringBuilder();

    public static String tree2str(TreeNode t) {
        //题解版
        //如果当前节点为空
       /*
        if (t == null)
            return "";
        //左右子树为空.
        if (t.left == null && t.right == null)
            return t.val + "";
        //右子树为空,左子树不为空
        if (t.right == null)
            return t.val + "(" + tree2str(t.left) + ")";
        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
        //如果当前节点有左右子树,在两个子树的结果外加上一个(  左子树  右子树  )
        */

        if (t == null) {
            return "";
        }
        helper(t);
        //第一个节点不需要括号包括
        builder.deleteCharAt(0);
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    private static void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        builder.append("(");
        builder.append(root.val);
        helper(root.left);
        //左节点为空,且有右节点.要增加个()表示左子树为空
        if (root.left == null && root.right != null) {
            builder.append("()");
        }
        //递归右子树
        helper(root.right);
        builder.append(")");
    }
}
