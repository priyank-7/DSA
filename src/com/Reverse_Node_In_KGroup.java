package com;

public class Reverse_Node_In_KGroup {
    public static void main(String[] args) {
        ListNode ref = reverseKGroup(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6)))))),2);
        while (ref != null){
            System.out.println(ref.val);
            ref = ref.next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        if (head == null){
            return head;
        }

        ListNode[] ar = helper(head,k);

        if(ar == null){
            return head;
        }
        ListNode end = ar[0];
        ListNode after_end = ar[1];

        ListNode start = end;
        while (start.next != null){
            start = start.next;
        }

        ListNode before_start = null;
        head = end;
        start.next = after_end;

        while(start.next != null){
            int x = k;

            before_start = end;
            while (before_start.next != null && k-- > 0){
                before_start = before_start.next;
            }
            start = after_end;
            ar = helper(start,k);

            if(ar == null){
                before_start.next = start;
                return head;
            }
            end = ar[0];
            after_end = ar[1];
            before_start.next = end;
            start.next = after_end;
        }
        return head;
    }

    public static ListNode[] helper(ListNode node, int k){

        int [] arr = new int[k];
        ListNode temp = node;
        ListNode lnd = temp;

        while (temp != null && k > 0) {
            arr[k-1] = temp.val;
            temp = temp.next;
            k--;
        }
        if (k != 0){
            return null;
        }

        else {
            lnd = temp;
            ListNode head = null;
            for (int i : arr) {
                if (head == null) {
                    head = new ListNode(i);
                    temp = head;
                    continue;
                }
                temp.next = new ListNode(i);
                temp = temp.next;
            }
            return new ListNode[]{head,lnd};
        }
    }
}
