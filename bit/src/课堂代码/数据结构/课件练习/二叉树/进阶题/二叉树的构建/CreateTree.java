package 课堂代码.数据结构.课件练习.二叉树.进阶题.二叉树的构建;

import java.util.Scanner;

public class CreateTree {
    public static class TreeNode {
        char val;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            char[] array = s.toCharArray();
            TreeNode root = build(array);
            inorder(root);
            System.out.println();
        }
    }

    //中序遍历
    private static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.leftNode);
        System.out.print(root.val + " ");
        inorder(root.rightNode);
    }

    //先序构建
    static int index = 0;

    private static TreeNode build(char[] array) {
        if (array[index] == '#') {
            return null;
        }
        TreeNode root = new TreeNode(array[index]);
        index++;
        root.leftNode = build(array);
        index++;
        root.rightNode = build(array);
        return root;
    }
}
