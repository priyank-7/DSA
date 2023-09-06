package comm;

import java.util.ArrayList;
import java.util.List;

public class Sorted_LL_To_BST {
    public static void main(String[] args) {

        ListNode head = new ListNode(-10,new ListNode(-3,new ListNode(0,new ListNode(5,new ListNode(9)))));
        System.out.println(sortedListToBST(head));
    }

    public static TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        return helper(list, 0, list.size()-1);

    }

    public static TreeNode helper(List<Integer> list, int start, int end){


        TreeNode head = null;

        while(start <= end){

            int mid = (start+end)/2;

            head = new TreeNode(list.get(mid));

            head.left = helper(list, start, mid-1);

            head.right = helper(list, mid+1, end);

            return head;
        }
        return null;
    }
}
