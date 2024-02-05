package Lesson05_02_2024.Tree;

public class BinaryTree {
    public static void main(String[] args) {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');

        A.setLeft(B);
        A.setRight(C);
        B.setLeft(D);
        B.setRight(E);

        Tree tree = new Tree(A);
//        tree.preOrder(A);
//        tree.postOrder(A);
//        tree.inOrder(A);
    }
}

class Node {
    private char key; //значение
    private Node left; //левый дочерний элемент
    private Node right; //правый дочерний элемент

    public Node(char key) {
        this.key = key;
    }

    public char getKey() {
        return key;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }


    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }


}

class Tree {
    private Node root = null;

    public Tree(Node root) {
        this.root = root;
    }

    //Прямой,обратный и симметричный (preOrder,postOrder,inOrder)
    public void preOrder(Node node) {
        System.out.print(node.getKey());
        if (node.getLeft() != null) preOrder(node.getLeft());
        if (node.getRight() != null) preOrder(node.getRight());
    }

    public void postOrder(Node node) {

        if (node.getLeft() != null) postOrder(node.getLeft());
        if (node.getRight() != null) postOrder(node.getRight());
        System.out.print(node.getKey());
    }

    public void inOrder(Node node) {

        if (node.getLeft() != null) inOrder(node.getLeft());
        if (node.getRight() != null) inOrder(node.getRight());
        System.out.print(node.getKey());
    }
}
