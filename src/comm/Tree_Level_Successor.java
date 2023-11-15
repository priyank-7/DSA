package comm;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_Level_Successor {
    public static void main(String[] args) {

    }

    public  static TreeNode findSuccessor(TreeNode root, int target){

        if(root == null){
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.isEmpty()){
            TreeNode temp = q.poll();

            if(temp.left == null && temp.right == null){
                return null;
            }
            else {
                if (temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
        return q.poll();
    }
}
