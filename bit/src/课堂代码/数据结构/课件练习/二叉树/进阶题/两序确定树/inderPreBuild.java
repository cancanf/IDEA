package 课堂代码.数据结构.课件练习.二叉树.进阶题.两序确定树;


import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inderPreBuild {
    public static void main(String[] args) {
        int[] a = {3, 9, 20, 15, 7};
        int[] b = {9, 3, 15, 20, 7};
        TreeNode root = buildTree(a, b);
        preorderByLoop(root);
    }

    public static int index = 0;

    //非递归前序遍历
    public static void preorderByLoop(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            System.out.println(pop.val);
            if (pop.right != null) {
                stack.add(pop.right);
            }
            if (pop.left != null) {
                stack.add(pop.left);
            }
        }
    }

    //先序中序确定二叉树结构
    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        index = 0;
        //将中序结果存入list集合
        List<Integer> list = new ArrayList<>();
        for (int i :
                inorder) {
            list.add(i);
        }
        return _buildTree(preorder, list);
    }

    private static TreeNode _buildTree(int[] preorder, List<Integer> list) {

        if (list.isEmpty()) {
            return null;
        }
        if (index >= preorder.length) {
            return null;
        }
        //创建节点
        TreeNode root = new TreeNode(preorder[index]);
        //确定在中序结果中的位置
        int pos = list.indexOf(root.val);
        index++;
        //递归左右子树的结果
        root.left = _buildTree(preorder, list.subList(0, pos));
        root.right = _buildTree(preorder, list.subList(pos + 1, list.size()));
        return root;

    }
}
