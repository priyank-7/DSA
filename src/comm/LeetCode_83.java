package comm;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class LeetCode_83 {
    public static void main(String[] args) {

        ListNode l = new ListNode();
    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null){
            return head;
        }

        ListNode node = head;
        while(node.next != null){

            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
}
