package com.bridgelabz.bst;
public class BinarySearchMain {
    /**
     *  Create a Binary Search Tree by adding 56 and then adding 30 & 70.
     * ====================================================================
     *1. Creating object to access the function of function class
     *2. Creating root node as null
     *2. Adding the sub-nodes of Binary Tree
     *3. Printing the elements
     */
    public static void main(String[] args) {

        /**
         * 1. Creating an object of function class
         */
        BinarySearchTree link = new BinarySearchTree();
        /**
         * 2.creating root node as null
         */
        INode root = null;
        /**
         *
         */
        INode size=new INode();

        /**
         * 4.Adding sub-nodes to the Binary Tree
         */
        root = link.insert(root, 56);
        root = link.insert(root, 30);
        root = link.insert(root, 70);
        root = link.insert(root, 22);
        root = link.insert(root, 40);
        root = link.insert(root, 60);
        root = link.insert(root, 95);
        root = link.insert(root, 11);
        root = link.insert(root, 65);
        root = link.insert(root, 3);
        root = link.insert(root, 16);
        root = link.insert(root, 63);
        root = link.insert(root, 67);

        /**
         * 5.Printing the tree
         */
        link.printBinarySearchTree(root);
        /**
         * 6. Getting Size of the Tree
         */
        int x = size.size(root);
        System.out.println("\nSize of Tree: "+x);
        /**
         * 6. Searching for given key value whether it is present or not
         */
        link.search(root, 63);
    }
}
