/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    
    class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Binary Search Tree");

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(45);
        bst.insert(23);
        bst.insert(44);
        bst.insert(10);
        bst.insert(8);
        bst.insert(100);
        bst.insert(78);

        System.out.print("Inorder Traversal: ");
        bst.inorder();
      
    }
    
    
}
