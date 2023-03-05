package com;


import java.util.Enumeration;

class Node{
    int data;
    int priority;
    Node next;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public Node(int data) {
        this.data = data;
    }
}
public class P_Queue {

    Node head;
    Node tail;

    public P_Queue(Node head) {
        this.head = head;
    }

    public void enqueue(int data, int priority){
        if (head == null){
            Node temp = new Node(data, priority);
            head = temp;
            tail = temp;
            temp.next = null;
            return;
        }

        Node temp = new Node(data, priority);
        tail.next = temp;
        temp.next = null;
        tail = temp;
    }

}

