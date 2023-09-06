package comm;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Zig_Zag {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        ans = helper(root,ans,0);

        int c = 0;
        for(List<Integer> i : ans){
            if(c%2 != 0){
                for (int j = 0; j < i.size()/2; j++) {
                    int temp = i.get(j);
                    i.set(j,i.get(i.size()-j-1));
                    i.set(i.size()-j-1,temp);
                }
            }
            c++;
        }

        return ans;
    }



    public static List<List<Integer>> helper(TreeNode root, List<List<Integer>> ans, int l){

        if(root == null){
            return ans;
        }
        if(ans.size() < l+1){
            ans.add(new ArrayList<>());
        }
        if(ans.get(l) == null){
            ans.add(new ArrayList<>());
            ans.get(l).add(root.val);
        }
        else{
            ans.get(l).add(root.val);
        }

        ans = helper(root.left, ans, ++l);

        ans = helper(root.right, ans, l);

        return ans;
    }
}
