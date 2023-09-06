package comm;

public class Mearge_Sort_LL {
    public static void main(String[] args) {
        ListNode n4 = new ListNode(3,null);
        ListNode n3 = new ListNode(1,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(4,n2);

        ListNode l = sort(n1);
        while (l != null){
            System.out.println(l.val);
            l = l.next;
        }

    }

    public static ListNode sort(ListNode head){

        if (head == null || head.next == null){
            return head;
        }

        ListNode mid = findMid(head);
        ListNode left = sort(head);
        ListNode right = sort(mid);

        return mergeTwoLists(left, right);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

    public static ListNode findMid(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null)? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
