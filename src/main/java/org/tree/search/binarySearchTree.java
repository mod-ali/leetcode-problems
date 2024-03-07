package org.tree.search;

class binarySearchTree {

    //Variables
    private Node root;

    //Getter for Root
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //Wrapper function for recursive search
    public Node search(int value) {

        if (isEmpty()) {
            return null; // if tree is empty simply return null
        }

        // return the output of the recursive search
        return searchRecursive(root, value);
    }

    //Recursive search function
    public Node searchRecursive(Node currentNode, int value) {
        // if node is null or value is found then return node
        if (currentNode == null || currentNode.getData() == value) {
            return currentNode;
        }

        // if value is less than node's data then search left sub-tree
        if (currentNode.getData() > value) {
            return searchRecursive(currentNode.getLeftChild(), value);
        } else {
            // if value is greater than node's data then search right sub-tree
            return searchRecursive(currentNode.getRightChild(), value);
        }
    }

    //Recursive function to insert a value in BST
    public Node recursive_insert(Node currentNode, int value) {

        //Base Case
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.getData()) {
            //Iterate left sub-tree
            currentNode.setLeftChild(recursive_insert(currentNode.getLeftChild(), value));
        } else if (value > currentNode.getData()) {
            //Iterate right sub-tree
            currentNode.setRightChild(recursive_insert(currentNode.getRightChild(), value));
        } else {
            // value already exists
            return currentNode;
        }

        return currentNode;

    }

    //Function to call recursive insert
    public boolean add(int value) {

        root = recursive_insert(this.root, value);
        return true;
    }

    //Function to check if Tree is empty or not
    public boolean isEmpty() {
        return root == null; //if root is null then it means Tree is empty
    }

    //Just for Testing purpose
    public void printTree(Node current) {
        if (current == null) {
            return;
        }

        System.out.print(current.getData() + ",");
        printTree(current.getLeftChild());
        printTree(current.getRightChild());

    }
}