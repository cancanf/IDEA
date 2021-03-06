package 课堂代码.数据结构.课件练习.二叉树.简单题.层序遍历和完全二叉树;

import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        leverOrder(a);
    }

    public static void leverOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode remove = queue.remove();
            if (remove.left != null) {
                queue.offer(remove.left);
            }
            if (remove.right != null) {
                queue.offer(remove.right);
            }
            System.out.println(remove.val);
        }
    }
}
