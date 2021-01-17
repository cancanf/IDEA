package 开放性实验.二叉树.递归调用;

public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.addchild(3);
        root.addchild(2);
        root.addchild(3);
        root.addchild(4);
        root.addchild(5);
        TreeNode p = root;
        printTree(p.right);
    }

    private static void printTree(TreeNode p) {
        if(p!=null){
        printTree(p.left);
        System.out.println(p.Date);
        printTree(p.right);
    }
    }
}
