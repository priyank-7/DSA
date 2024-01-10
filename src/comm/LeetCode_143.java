package comm;

import java.util.Stack;

public class LeetCode_143 {
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
        ListNode x = reorderList(l1);
        while (x != null){
            System.out.println(x.val);
            x = x.next;
        }
    }

    public static ListNode reorderList(ListNode head) {

        if(head == null){
            return head;
        }
        Stack<ListNode> st = new Stack<>();

        ListNode slow = head;
        ListNode fast = head;
        ListNode n = slow;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            n = slow;
            slow = slow.next;
        }

        if(fast == null){
            n.next = null;
            ListNode temp = slow;
            while(temp != null){
                st.push(temp);
                temp = temp.next;
            }
        }
        else{
            ListNode temp = slow.next;
            slow.next = null;
            while(temp != null){
                st.push(temp);
                temp = temp.next;
            }
        }

        ListNode x = head;
        ListNode y = head;

        while(!st.isEmpty()){
            y = x.next;
            ListNode z = st.pop();
            x.next = z;
            z.next = y;
            x = y;
        }
        return head;
    }
}
