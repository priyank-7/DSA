package comm;

public class LeetCode_206 {
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

        ListNode l = reverseList(l1);
        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static ListNode reverseList_1(ListNode head){

        ListNode a = head;
        ListNode b = null;

        while(a != null){

            ListNode temp = a.next;
            a.next = b;
            b = a;
            a = temp;
        }
        return b;
    }

    public static ListNode reverseList(ListNode head) {

        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int [] arr = new int[size];
        ListNode node = head;

        for(int i = 0; i < size; i++){
            arr[i] = node.val;
            node = node.next;
        }

        ListNode head_ = new ListNode(arr[size-1]);
        ListNode temp_ = head_;

        for(int i = size-2; i >= 0; i--){
            ListNode n = new ListNode(arr[i]);
            temp_.next = n;
            temp_ = n;
        }
        return head_;
    }
}
