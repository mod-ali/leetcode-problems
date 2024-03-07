 /* Max created on 3/12/2023 inside the package - org.linkedlist */

 package org.linkedlist;

 public class SearchLinkedList<T> {

     public static void main(String[] args) {

     }

     public class Node {

         public T data;
         public
         Node nextNode;

     }

     public Node headNode;
     public int size;

     public int getSize() {
         return this.size;
     }

     public boolean isEmpty() {
         return headNode != null;
     }

     public void printList() {
         if (isEmpty()) {
             System.out.println("List is empty");
             return;
         }

         Node node = headNode;

         while (node.nextNode != null) {
             System.out.print(node.data.toString() + " -> ");
             node = node.nextNode;
         }
         System.out.println(node.data.toString() + " -> null");
     }

     public boolean searchNode(T data) {
         // Write -- Your -- Code
         if (isEmpty()) {
             return false;
         }

         Node node = headNode;

         while (node.nextNode != null) {
             if (node.data.equals(data)) {
                 return true;
             }
             node = node.nextNode;
         }

         return false; //value not found
     }

     //Deletes data from the head of list
     public void deleteAtHead() {
         //if list is empty then simply return
         if (isEmpty()) {
             return;
         }
         //make the nextNode of the headNode equal to new headNode
         headNode = headNode.nextNode;
         size--;
     }

     public void deleteByValue(T data) {
         //if empty then simply return
         if (isEmpty()) {
             return;
         }

         //Start from head node
         Node currentNode = this.headNode;

         if (currentNode.data.equals(data)) {
             //data is at head so delete from head
             deleteAtHead();
             return;
         }

         Node prevNode = null; //previous node starts from null
         //traverse the list searching for the data to delete
         while (currentNode != null) {
             //node to delete is found
             if (data.equals(currentNode.data)) {
                 prevNode.nextNode = currentNode.nextNode;
                 size--;
                 return;
             }
             prevNode = currentNode;
             currentNode = currentNode.nextNode;
         }

     }

 }
