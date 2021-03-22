package 课堂代码.数据结构.课件练习.二叉树.简单题.层序遍历和完全二叉树;

import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class isCompleteTree {
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
        c.left = g;
        c.right = f;
        System.out.println(iscompleteTree(a));
    }

    private static boolean iscompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        //先层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isok = true;
        while (!queue.isEmpty()) {
            TreeNode remove = queue.remove();
            //第一种
     /*
     if(isok){
          //正常节点,左右子树都有
          if(remove.left!=null && remove.right !=null){
              queue.offer(remove.left);
              queue.offer(remove.right);
              //只有右子树
          }else if (remove.left == null && remove.right != null){
              return false;
          }else if (remove.left != null && remove.right == null){
              isok = false;
              queue.offer(remove.left);
          }else if(remove.left == null && remove.right == null){
              isok = false;
          }
      }else {
          if (!(remove.left == null && remove.right == null)) {
              return false;
          }
      }
*/

            //第二种
            if (isok) {
                //第一阶段
                //          没有子树                                              只有左子树
                if ((remove.left == null && remove.right == null) || (remove.left != null && remove.right == null)) {
                    isok = false;
                } else if (remove.left == null) {
                    return false;
                }
            } else {
                if (!(remove.left == null && remove.right == null)) {
                    return false;
                }
            }
            if (remove.left != null) {
                queue.offer(remove.left);
            }
            if (remove.right != null) {
                queue.offer(remove.right);
            }
        }
        return true;
    }
}