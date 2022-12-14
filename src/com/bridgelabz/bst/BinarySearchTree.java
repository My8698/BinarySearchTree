package com.bridgelabz.bst;

public class BinarySearchTree extends INode {
    /**
     * 1.Creating new node if there is no Binary Tree exists
     * 2. Method for printing the Binary Tree
     */

    public INode createNewNode(int k) {
        INode a = new INode();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
    /**
     * 1. Creating new node if there is no Binary Tree exists
     */
    public INode insert(INode node, int k) {
        if (node == null) {
            return createNewNode(k);
        }
        if (k < node.data) {
            node.left = insert(node.left, k);
        } else if (k > node.data) {
            node.right = insert(node.right, k);
        }
        return node;

    }

    /**
     * 2. Method for printing the Binary Tree
     */
    public void printBinarySearchTree(INode node) {
        if (node == null) {
            return;
        }
        printBinarySearchTree(node.left);
        System.out.print(node.data + " -> ");
        printBinarySearchTree(node.right);
    }
}
