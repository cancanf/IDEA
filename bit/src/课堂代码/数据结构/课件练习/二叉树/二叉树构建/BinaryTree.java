package 课堂代码.数据结构.课件练习.二叉树.二叉树构建;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    String val;
    Node left;
    Node right;

    public Node(String val) {
        this.val = val;
    }
}

public class BinaryTree {
    //和类一起加载了
    public static Node build() {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    //先序遍历
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //中序遍历
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //后序遍历
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    //层序遍历
    public static void tierOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.element().val);
            if (queue.element().left != null) {
                queue.offer(queue.element().left);
            }
            if (queue.element().right != null) {
                queue.offer(queue.element().right);
            }
            queue.remove();
        }
    }

    //使用成员变量求树的元素个数
    public static int count = 0;

    public static void length(Node root) {
        if (root == null) {
            return;
        }
        count++;
        length(root.left);
        length(root.right);
    }


    //递归求树的元素个数
    public static int length2(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + length2(root.left) + length2(root.right);
    }

    //求有多少个叶子结点
    public static int leafSize = 0;

    public static void getLeafSize(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize(root.left);
        getLeafSize(root.right);
    }

    //递归求叶子结点个数
    public static int getLeafSize2(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    //递归求某一层节点个数
    public static int getKLevelSize(Node root, int k) {
        if (root == null) {
            return 0;
        }
        if (root != null && k == 1) {
            return 1;
        }
        return getKLevelSize(root.left, k - 1) + getKLevelSize(root.right, k - 1);
    }


    //递归求树的深度
    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return 1 + (left > right ? left : right);
    }

    //查找根据字段返回节点地址
    public static Node find(Node root, String toFind) {
        if (root == null) {
            return null;
        }
        if (root.val == toFind) {
            return root;
        }
        Node nodeleft = find(root.left, toFind);
        if (nodeleft != null) {
            return nodeleft;
        } else {
            return find(root.right, toFind);
        }
    }

    public static void main(String[] args) {
        Node root = BinaryTree.build();
//        BinaryTree.preOrder(root);
//        System.out.println("\n=======================");
//        BinaryTree.inOrder(root);
//        System.out.println("\n=======================");
//        BinaryTree.postOrder(root);
//        BinaryTree.length(root);
//        System.out.println(count);
//        System.out.println(BinaryTree.length2(root));
//        BinaryTree.getLeafSize(root);
//        System.out.println(leafSize);
//        System.out.println(BinaryTree.getLeafSize2(root));
//        System.out.println(BinaryTree.getKLevelSize(root, 4));
//        System.out.println(BinaryTree.getHeight(root));
//        System.out.println(BinaryTree.find(root, "D"));
        BinaryTree.tierOrder(root);
    }
}
