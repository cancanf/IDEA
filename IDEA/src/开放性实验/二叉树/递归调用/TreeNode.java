package 开放性实验.二叉树.递归调用;

public class TreeNode {
    int Date;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int date) {
        Date = date;
        this.left = null;
        this.right = null;
    }

    public TreeNode newTreeNode(int date) {
        return new TreeNode(date);
    }

    void addchild(int date) {
        if (date < Date) {
            if (left == null) {
                left = newTreeNode(date);
            } else {
                left.addchild(date);
            }
        } else if (date >= Date) {
            if (right == null) {
                right = newTreeNode(date);
            } else {
                right.addchild(date);
            }
        }
    }
}
