package com;


import java.util.Random;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    ListNode head;
    int length;

    public Solution(ListNode head) {
        this.head = head;
        helper();
    }

    public void helper(){
        int length = 1;

        ListNode pointer = head;

        while(pointer != null && pointer.next != null){
            if(pointer.next.next == null){
                length++;
                break;
            }
            pointer = pointer.next.next;
            length+=2;
        }
        this.length = length;
    }

    public int getRandom() {

        Random rnd = new Random();
        int l = ((rnd.nextInt()) % ((length-1)+1)) + 1;
        ListNode temp = head;
        l--;

        while(l-- > 0){

            temp = temp.next;
        }
        return temp.val;

    }


}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */

public class Linked_List_Random_Node {
    public static void main(String[] args) {
        Solution s = new Solution(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4)))));
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
        System.out.println(s.getRandom());
    }
}
