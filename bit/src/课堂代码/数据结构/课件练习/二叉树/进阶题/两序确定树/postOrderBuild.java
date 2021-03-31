package 课堂代码.数据结构.课件练习.二叉树.进阶题.两序确定树;


import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postOrderBuild {
    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = buildTree(inorder, postorder);
        post(root);
    }

    //后续遍历非递归
    private static void post(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode next = root;
        TreeNode pre = null;

        while (next != null || !stack.empty()) {
            while (next != null) {
                stack.add(next);
                next = next.left;
            }
            TreeNode peek = stack.peek();
            if (peek.right == null || peek.right == pre) {
                System.out.println(peek.val);
                pre = stack.pop();
                ;
            } else {
                next = peek.right;
            }
        }
    }

    public static int index = 0;

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length - 1;
        List<Integer> list = new ArrayList<>();
        for (int i :
                inorder) {
            list.add(i);
        }
        return _buildTree(postorder, list);
    }

    private static TreeNode _buildTree(int[] postorder, List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (index < 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[index]);
        int pos = list.indexOf(root.val);
        index--;
        root.right = _buildTree(postorder, list.subList(pos + 1, list.size()));
        root.left = _buildTree(postorder, list.subList(0, pos));

        return root;
    }
}
