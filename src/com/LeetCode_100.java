package com;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
 }
public class LeetCode_100 {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode t1= new TreeNode(1,new TreeNode(2),new TreeNode(3));
        System.out.println(isSameTree(t,t1));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return (p.val == q.val) & isSameTree(p.left, q.left) & isSameTree(p.right,q.right);
    }
}
