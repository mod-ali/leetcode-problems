package org.tree.search;

class binarySearchTreeDemo {

    public static void main(String args[]) {

        binarySearchTree bsT = new binarySearchTree();

        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);
        bsT.add(12);
        bsT.add(10);
        bsT.add(14);
        System.out.println(">> Tree <<");
        bsT.printTree(bsT.getRoot());

        Node temp = bsT.search(5);
        if (temp != null) {
            System.out.println("\n" + temp.getData() + " found in Tree !");
        } else {
            System.out.println("\n Not found in Tree !");
        }

        temp = bsT.search(51);
        if (temp != null) {
            System.out.println("\n" + temp.getData() + " found in Tree !");
        } else {
            System.out.println("\n Not found in Tree !");
        }
    }
}