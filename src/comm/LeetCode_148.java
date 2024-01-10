package comm;

public class LeetCode_148 {
    public static void main(String[] args) {

    }

    public static ListNode sortList(ListNode head) {

        ListNode node = head;
        ListNode head_ = head;

        while (node != null){

            ListNode l = node;
            while (l.next != null){

                if (l.next.val < node.val){
                    ListNode temp = l.next;
                    l.next = l.next.next;
                    temp.next = node;
                    head_ = temp;
                }
            }
        }
        return head_;
    }
}
