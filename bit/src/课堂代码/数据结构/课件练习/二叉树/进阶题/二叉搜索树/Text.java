package 课堂代码.数据结构.课件练习.二叉树.进阶题.二叉搜索树;

import 课堂代码.数据结构.课件练习.二叉树.TreeNode;

public class Text {

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
        System.out.println(Convert(a));
    }

    public static TreeNode Convert(TreeNode pRootOfTree) {
        // 判定特殊情况
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }
        // 处理一般情况
        // 1. 先递归的把左子树转成链表
        //    得到的 leftHead 可能是 null, 下面在使用的时候要考虑到这个细节
        TreeNode leftHead = Convert(pRootOfTree.left);
        // 2. 把根节点尾插到 leftHead 这个链表中
        //    需要找到 leftHead 的末尾节点才能尾插
        TreeNode leftTail = leftHead;
        while (leftTail != null && leftTail.right != null) {
            leftTail = leftTail.right;
        }
        if (leftHead != null) {
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }
        // 3. 递归的转换右子树了
        TreeNode rightHead = Convert(pRootOfTree.right);
        // 4. 把当前节点头插到右侧链表的前面
        if (rightHead != null) {
            pRootOfTree.right = rightHead;
            rightHead.left = pRootOfTree;
        }
        // 需要返回这个最终链表的头结点.
        // 注意, leftHead 可能是空链表. 如果是空链表
        // 整体的头结点就应该是 pRootOfTree 了
        return leftHead != null ? leftHead : pRootOfTree;
    }
}
