package comm;

public class LeetCode_234 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(1);
//        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        System.out.println(isPalindrome(l1));
//        while(l != null){
//            System.out.println(l.val);
//            l = l.next;
//        }
    }

    public static boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        int sum = 0;

        while(fast != null && fast.next != null){
            sum += slow.val;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode node = slow;
        slow = slow.next;
        while(slow != fast){
            sum -= slow.val;
            slow = slow.next;

        }

        if(sum == 0){
            return true;
        }
        if(sum + node.val == 0){
            return true;
        }
        return false;
    }
}
