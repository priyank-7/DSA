package comm;


public class LeetCode_21 {
    public static void main(String[] args) {

        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertFirst(4);
        list1.insertFirst(2);
        list1.insertFirst(1);
        list2.insertFirst(4);
        list2.insertFirst(3);
        list2.insertFirst(1);

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f = list1;
        ListNode s = list2;

        ListNode ans = new ListNode();
        ListNode head = new ListNode();

        head.next = ans;

        while (f != null && s != null){
            if (f.val <= s.val){
                ans.next = f;
                f = f.next;
                ans = ans.next;
            }
            else {
                ans.next = s;
                s = s.next;
                ans = ans.next;
            }
        }

        while (f != null){
            ans.next = f;
            f = f.next;
            ans = ans.next;
        }
        while (s != null){
            ans.next = s;
            s = s.next;
            ans = ans.next;
        }
        return head.next.next;
    }
}
