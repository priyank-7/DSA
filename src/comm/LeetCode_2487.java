package comm;

public class LeetCode_2487 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode a = removeNodes(n1);
        while (a != null){
            System.out.println(a.val);
            a = a.next;
        }
    }

    public static ListNode removeNodes(ListNode head) {
        ListNode node = head;
        ListNode temp = null;

        if(head.val == head.next.val){
            head = head;
            temp = head;
            node = head;
        }
        else{
            while(node.val > node.next.val){
                node = node.next;
            }
            temp = node.next;
            head = temp;
            node = temp;
        }

        while(node.next != null){

            if(node.next.val > node.val){
                temp.next = node.next;
                node = temp.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
}
