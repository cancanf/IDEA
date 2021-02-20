package 开放性实验.二叉树;

class node {
    int data;

    node left;

    node right;

    public node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public node newTree(int val) {
        return new node(val);
    }
}

public class Binary {

    private node root;

    public Binary() {
        this.root = null;
    }

    public void insertInto(int data) {

        node newNode = new node(data);

        if (root == null) {
            root = newNode;
        } else {
            node currentNode = root;
            while (currentNode != null) {
                if (data < currentNode.data) {
                    currentNode = currentNode.left;
                    if (currentNode == null) {
                        currentNode = newNode;
                        break;
                    }
                } else if (data > currentNode.data) {
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        currentNode = newNode;
                        break;
                    }
                }
            }
        }
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


    }
}