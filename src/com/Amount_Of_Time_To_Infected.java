package com;

import java.util.ArrayList;
import java.util.List;

class pair_ {
    int val;
    int depth;
    public pair_(){}
    public pair_(int val, int depth){
        this.val = val;
        this.depth = depth;
    }
}

public class Amount_Of_Time_To_Infected {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5,new TreeNode(2,new TreeNode(4,new TreeNode(1),null),null),new TreeNode(3));
        TreeNode root = new TreeNode(1,null,new TreeNode(2,new TreeNode(3,null,new TreeNode(5)),new TreeNode(4)));
        System.out.println(amountOfTime(root,4));
    }

    int cnt = 0;
    public static int amountOfTime(TreeNode root, int start) {

        boolean ck =true;

        List<pair_> left = new ArrayList<>();
        List<pair_> right = new ArrayList<>();

        left.add(new pair_(root.val, 0));
        right.add(new pair_(root.val, 0));

        left = helper1(root.left, left, 1);
        right = helper2(root.right, right, 1);

        int ld = left.get(left.size()-1).depth;
        int rd = right.get(right.size()-1).depth;

        int dpt = 0;
        int x = 0;
        int y = 0;

        if(ck){
            for(pair_ i : left){
                if(i.val == start){
                    dpt = i.depth;
                    y = ld - dpt;
                    x = dpt + rd;
                    ck = false;
                    break;
                }
            }
        }
        if(ck){
            for(pair_ i : right){
                if(i.val == start){
                    dpt = i.depth;
                    y = rd - dpt;
                    x = dpt + ld;
                    ck = false;
                    break;
                }
            }
        }

        return Math.max(y,x);
    }

    public static List<pair_> helper1(TreeNode root, List<pair_> left, int depth){
        if(root == null){
            return left;
        }
        left.add(new pair_(root.val,depth));
        left = helper1(root.left, left, ++depth);
        left = helper1(root.right, left, depth);

        return left;
    }

    public static List<pair_> helper2(TreeNode root, List<pair_> right, int depth){
        if(root == null){
            return right;
        }
        right.add(new pair_(root.val,depth));
        right = helper1(root.left, right, ++depth);
        right = helper1(root.right, right, depth);

        return right;
    }
}
