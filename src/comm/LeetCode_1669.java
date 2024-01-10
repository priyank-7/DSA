package comm;

public class LeetCode_1669 {
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
        ListNode x = mergeInBetween(l1,3,4,l2);
        while (x != null){
            System.out.println(x.val);
            x = x.next;
        }

    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode node = list1;
        for(int i = 1; i < a; i++){
            node = node.next;
        }
        ListNode temp = node.next;
        for(int i = a; i <= b; i++){
            temp = temp.next;
        }
        node.next = list2;
        ListNode t = list2;
        while(t.next != null){
            t = t.next;
        }
        if(temp != null){
            t.next = temp;
        }
        return list1;
    }
}
