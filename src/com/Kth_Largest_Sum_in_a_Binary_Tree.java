package com;

import java.util.*;

public class Kth_Largest_Sum_in_a_Binary_Tree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(897935);
        root.left = new TreeNode(796748);
        root.right = new TreeNode(528909);
//        root.left.left = new TreeNode(2);
//                root.left.right = new TreeNode(1);
//                        root.right.left = new TreeNode(3);
                                root.right.right = new TreeNode(905326);
                                        root.right.right.left = new TreeNode(706311);
                                                root.right.right.left.right = new TreeNode(282251);
        root.right.right.left.right.right = new TreeNode(139169);

        System.out.println(kthLargestLevelSum(root, 4));
    }


    public static long kthLargestLevelSum(TreeNode root, int k) {

        List <Integer> list = new ArrayList<>();
        list = helper(root, list);

        List<Long> ans = new ArrayList<>();
        int lev = 0;

        for(int i = 0; i< list.size(); i++){
            long sum = 0;
            for(int j = 0; j < Math.pow(2,lev); j++){
                if (i < list.size()){
                    sum += list.get(i);
                    i++;
                }
                else{
                    break;
                }
            }
            lev++;
            ans.add(sum);
            i--;
        }
        Collections.sort(ans);
        return ans.get(ans.size()-k);

    }

    public static List<Integer> helper (TreeNode root, List<Integer> list){

        int i = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        list.add(root.val);
        i++;

        while(!q.isEmpty()){
            TreeNode t =q.remove();
            if (t.left != null){
                q.add(t.left);
                list.add(t.left.val);
                i++;
            }
            if (t.left == null){
                list.add(0);
                i++;
            }
            if(t.right != null){
                q.add(t.right);
                list.add(t.right.val);
            }
            if (t.right == null){
                list.add(0);
                i++;
            }
        }
        return list;
    }
}
