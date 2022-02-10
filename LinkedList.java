package com.muthu;

public class LinkedList {
    Node head;

     class Node {
         int data;
         Node next;

         Node(int val){
             data = val;
             next = null;
         }
    }

    void InsertFirst(int val) {
        Node node = new Node(val);
        node.data = val;
        node.next = head;
        head = node;
    }

    void InsertLast(int val) {
        Node temp = head;
        if( temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.data = val;
        node.next = null;
        temp.next = node;
    }

    void print(){
        Node temp = head;
        if(temp.next != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
         LinkedList list = new LinkedList();
         list.InsertFirst(10);
         list.InsertFirst(20);
         list.InsertFirst(30);
         list.InsertLast(40);
         list.InsertLast(50);
         list.print();
    }
}
