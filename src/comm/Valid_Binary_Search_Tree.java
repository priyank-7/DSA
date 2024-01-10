package comm;

public class Valid_Binary_Search_Tree {
    public static void main(String[] args) {

    }

    public static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public static boolean helper(TreeNode root, Integer low, Integer high){
        if(root == null){
            return true;
        }
        if (low != null && root.val <= low){
            return false;
        }
        if(high != null && root.val >= high){
            return false;
        }
        return helper(root.left, low, root.val) && helper(root.right,root.val, high);
    }
}
