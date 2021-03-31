package 课堂代码.数据结构.课件练习.二叉树.进阶题.循环遍历;

import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        //非递归遍历的关键在于遍历顺序.
//        preOrderByLoop(a);
        inOrderByLoop(a);
//        postOrderByLoop(a);
    }

    //后序
    private static void postOrderByLoop(TreeNode root) {

        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        //next用来记录当前节点
        //pre 用来记录之前遍历过了的节点
        TreeNode next = root;
        TreeNode pre = null;
        //到达最左子树
        while (next != null || !stack.empty()) {
            while (next != null) {
                stack.add(next);
                next = next.left;
            }
            //查看栈顶元素的右子树为空或者被访问过的情况,可以访问并出栈
            TreeNode peek = stack.peek();
            if (peek.right == null || peek.right == pre) {
                System.out.println(peek.val);
                //记录访问情况避免循环访问
                pre = stack.pop();
            } else {
                //未访问不为空就可以指向右子树
                next = peek.right;
            }
        }
    }

    //中序
    private static void inOrderByLoop(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode next = root;
        //通过next != null和stack.empty来判断此时子树的情况
        while (next != null || !stack.empty()) {
            //先到达到最底层左子树
            while (next != null) {
                stack.add(next);
                next = next.left;
            }
            //出栈访问,检查是否有右子树
            next = stack.pop();
            System.out.println(next.val + " ");
            //将next指向右子树
            next = next.right;
        }

    }

    //前序
    private static void preOrderByLoop(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        stack.add(root);
        queue.add(root);

       /* while (!stack.empty()) {
            TreeNode poll = stack.pop();
            System.out.println(poll.val + " ");
            if (poll.right != null) {
                stack.add(poll.right);
            }
            if (poll.left != null) {
                stack.add(poll.left);
            }

        */
        //使用队列
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            System.out.println(poll.val + " ");

            if (poll.left != null) {
                queue.add(poll.left);
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }
        }
    }
}
