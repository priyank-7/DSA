package comm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_103 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if (root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> ans  = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList();
        q.add(root);

        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < len; i++){
                TreeNode temp = q.remove();
                level.add(temp.val);
                if(temp.right != null){
                    q.add(temp.right);
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
            }
            ans.add(level);
        }
        return ans;
    }

}
