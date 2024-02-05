package Lesson05_02_2024.Tree;

import java.util.Arrays;

public class BinaryTree2 {
    public static void main(String[] args) {
        Tree2 tree = new Tree2();
        tree.addRoot('A');
        tree.addLeftChild('B', 0);
        tree.addRightChild('C', 0);
        tree.addLeftChild('D', 1);
        tree.addRightChild('E', 1);
        tree.print();
        System.out.println(tree.getLeftChild('A'));
//        tree.postOrder('A');
    }
}

// Helper class
class Tree2 {
    // Member variables of this class
    static int root = 0;

    static char[] arr = new char[10];

    // Creating root node
    public void addRoot(char key) {
        arr[0] = key;
    }

    // Creating left child of root
    public void addLeftChild(char key, int root) {
        int left = (root * 2) + 1;
        if (arr[root] == 0)
            System.out.printf("Can't set child at %d, no parent found\n", left);
        else
            arr[left] = key;
    }

    // Creating right child of root
    public void addRightChild(char key, int root) {
        int right = (root * 2) + 2;
        if (arr[root] == 0)
            System.out.printf("Can't set child at %d, no parent found\n", right);
        else
            arr[right] = key;
    }

    // To print tree
    public void print() {
        // Iterating using for loop
        for (int i = 0; i < 10; i++)
            if (arr[i] != 0)
                System.out.print(arr[i]);
            else
                System.out.print("-");
        System.out.println();
    }

    public static int findNode(char key) {
        if (key == 0) return -1;
        return Arrays.binarySearch(arr, key);
    }

    public static char getLeftChild(char key) {
        int node = findNode(key);
        if (key == -1) return 0;
        if (node * 2 + 1 < arr.length)
            return arr[node * 2 + 1];
        else return 0;
    }

    public static char getRightChild(char key) {
        int node = findNode(key);
        if (key == -1) return 0;
        if (node * 2 + 2 < arr.length)
            return arr[node * 2 + 2];
        else return 0;
    }

    public static int getRoot() {
        return root;
    }

    public static char[] getArr() {
        return arr;
    }

    public static void postOrder() {

//        if (Tree2.getLeftChild(arr[root]) != 0) postOrder(Tree2.getLeftChild();
//        if (Tree2.getRightChild(arr[root]) != 0) postOrder(Tree2.getLeftChild());
        System.out.print(Tree2.getArr());
    }
}


