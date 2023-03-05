package com;

class ListNode_ {
    int val;
    ListNode_ next;
    ListNode_() {}
    ListNode_(int val) { this.val = val; }
    ListNode_(int val, ListNode_ next) { this.val = val; this.next = next; }
}
public class LeetCode_876 {
    public static void main(String[] args) {

    }

    public ListNode_ middleNode(ListNode_ head) {

        ListNode_ slow = head;
        ListNode_ fast = head;

        try{
            fast = fast.next.next;
            slow = slow.next;
        }
        catch (Exception e){
            return slow;
        }
        return null;
    }
}
