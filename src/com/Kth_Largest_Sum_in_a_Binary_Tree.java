package com;

import java.util.*;

public class Kth_Largest_Sum_in_a_Binary_Tree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(605481);
        root.right = new TreeNode(87336);
        root.right.right = new TreeNode(226750);


//        helper(root);
        System.out.println(kthLargestLevelSum(root, 1));
    }


    public static long kthLargestLevelSum(TreeNode root, int k) {

        return helper(root, k);

    }

    public static int helper(TreeNode root, int k){

        int level = 1;
        HashMap<Integer,ArrayList<Integer>> map =  new HashMap<>();
        map = dfs(root,level,map);
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int x : map.keySet()) {
            ArrayList<Integer> list = map.get(x);
            int sum = 0;
            for (int i : list) {
                sum += i;
            }
            if (x > max){
                max = x;
            }
            ans.add(sum);
        }


        Collections.sort(ans);
        if (ans.size() >= k){
            return ans.get(ans.size()-k);
        }
        return -1;
    }

    public static HashMap<Integer,ArrayList<Integer>> dfs (TreeNode node,int level, HashMap<Integer,ArrayList<Integer>> map){

        map.computeIfAbsent(level, value -> new ArrayList<>()).add(node.val);
        level++;
        if (node.left != null){
            dfs(node.left, level, map);
        }
        if (node.right != null){
            dfs(node.right,level,map);
        }
        return map;
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
