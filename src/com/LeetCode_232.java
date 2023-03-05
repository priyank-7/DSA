package com;

//class Node{
//
//    int data;
//    Node next;
//
//    public Node(int x){
//        this.data = x;
//        this.next = null;
//    }
//}

class stack{

    Node head;
    int size;

    public stack(){

        this.head = null;
        this.size = 0;
    }

    public void push (Node node){

        if(head == null){
            node.next = null;
            this.head = node;
            size++;
            return;
        }

        node.next = head;
        head = node;
    }

    public Node pop(){

        if(head == null){
            return null;
        }

        Node temp = head;
        head = head.next;
        size--;
        return temp;
    }


    public int size(){
        return size;
    }

    public boolean isEmpty(){

        if(head == null){
            return true;
        }
        return false;
    }

}


class MyQueue {

    stack st = new stack();
    int ss = 0;

    public MyQueue() {
        this.st = new stack();
        this.ss = 0;
    }

    public void push(int x) {
        Node temp = new Node(x);
        st.push(temp);
        ss++;
    }

    public int pop() {

        Node temp = st.head;

        for(int i = 1; i < ss; i++){
            temp = temp.next;
        }
        ss--;
        return temp.data;
    }

    public int peek() {

        Node temp = st.head;
        for(int i = 1; i < ss; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean empty() {
        return ss==0;
    }
}

public class LeetCode_232 {
    public static void main(String[] args) {

        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.st.isEmpty());

    }

}
