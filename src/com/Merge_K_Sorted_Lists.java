package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge_K_Sorted_Lists {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> lst = new ArrayList<>();

        for(ListNode i : lists){
            ListNode temp = i;
            while(temp != null){
                lst.add(temp.val);
                temp = temp.next;
            }
        }

        Collections.sort(lst);

        ListNode head = null;
        ListNode temp = head;
        for(int i : lst){
            if(head == null){
                head = new ListNode(i);
                temp = head;
                continue;
            }
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return head;
    }
}
