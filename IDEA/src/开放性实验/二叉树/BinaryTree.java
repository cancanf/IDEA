package 开放性实验.二叉树;

class BinaryTreeNode {
    int data;

    node left;

    node right;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    private node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insertIntoTree(int data) {

        node newNode = new node(data);

        if (root == null) {
            root = newNode;
        } else {
            node currentNode = root;
            node parentNode;
            while (currentNode != null) {
                if (data < currentNode.data) {
                    parentNode = currentNode;
                    currentNode = currentNode.left;
                    if (currentNode == null) {
                        parentNode.left = newNode;
                    }
                } else if (data > currentNode.data) {
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        parentNode.right = newNode;
                    }
                }
            }
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public node search(int data) {
        return BinaryTreeSearch(root, data);
    }

    public node BinaryTreeSearch(node node, int data) {
        if (node == null)
            return null;
        if (data == node.data) {
            return node;
        } else if (data < node.data) {
            return BinaryTreeSearch(node.left, data);
        } else {
            return BinaryTreeSearch(node.right, data);
        }
    }


    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertIntoTree(12);
        binaryTree.insertIntoTree(1);
        binaryTree.insertIntoTree(2);
        binaryTree.insertIntoTree(45);
        binaryTree.insertIntoTree(24);
        binaryTree.insertIntoTree(68);
        binaryTree.insertIntoTree(89);
        binaryTree.insertIntoTree(23);

        node node = binaryTree.search(89);
        System.out.println(node.data);

    }
}