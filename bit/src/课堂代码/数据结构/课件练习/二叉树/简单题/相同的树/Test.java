package 课堂代码.数据结构.课件练习.二叉树.简单题.相同的树;

import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

public class Test {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
