package 课堂代码.数据结构.课件练习.二叉树.平衡二叉树;

import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

public class Text {
    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if ((leftHeight - rightHeight) > 1 || (rightHeight - leftHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return 1 + (Math.max(left, right));
    }
}
