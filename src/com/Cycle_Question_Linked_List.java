package com;





public class Cycle_Question_Linked_List {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l4;
        System.out.println(detectCycle(l1).val);
    }

    //  141. Linked List Cycle  (Check if the cycle is present or not)
    //  Amazon and Microsoft

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    //  Find the length of the cycle

    public static int LengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //  Calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }
        }
        return 0;
    }


    //  Find the first element of the loop
    public static ListNode detectCycle(ListNode head) {

        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = LengthCycle(slow);
                break;
            }
        }

        if (length == 0){
            return null;
        }
        //  Find the start node
        ListNode first = head;
        ListNode second = head;

        while (length > 0){
            second = second.next;
            length--;
        }

        //  Keep moving both forward and they will meet at start
        while (first != second){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
