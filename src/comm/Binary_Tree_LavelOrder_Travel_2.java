package comm;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_LavelOrder_Travel_2 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        ans = helper(root,ans,0);

        for(int i = 0; i < ans.size(); i++){
            List<Integer> temp = ans.get(i);
            ans.set(i,ans.get(ans.size()-i-1));
            ans.set(ans.size()-i-1,temp);
        }
        ArrayList<Integer> list;

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
