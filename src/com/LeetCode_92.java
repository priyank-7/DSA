package com;

public class LeetCode_92 {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        ListNode l = reverseBetween(l1, 3,5);
        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null){
            return null;
        }
        if(left == right){
            return head;
        }
        ListNode temp = head;
        int counter = 1;

        ListNode first = new ListNode();
        boolean flag = false;
        if(left == 1){
            first.next = head;
            flag = true;
        }
        while(counter != right){
            if(counter == left-1){
                first = temp;
            }
            temp = temp.next;
            counter++;
        }
        ListNode second = new ListNode();
        second = temp;

        ListNode a = first.next;
        ListNode b = second.next;

        while(a != second){

            ListNode temp_ = a.next;
            a.next = b;
            b = a;
            a = temp_;
        }
        a.next = b;
//        b = a;
        first.next = a;
        if (flag){
            return a;
        }
        return head;
    }
}
