package comm;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_94 {

    static List<Integer> l = new ArrayList<>();

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);
        t1.right = new TreeNode(2);
        t1.right.left = new TreeNode(3);
        helper(t1, l);
        System.out.println(l);
    }

    static void helper(TreeNode root, List<Integer> l){

        if(root == null){
            return;
        }
        l.add(root.val);
        helper(root.left, l);
        helper(root.right, l);
    }
}
