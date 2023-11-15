package comm;

public class Balanced_Binary_Tree {

    static boolean flag = true;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        System.out.println(isBalanced(root));
        System.out.println(flag);
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return (Math.abs(helper(root.left) - helper(root.right)) <= 1);
    }

    static int helper(TreeNode root){

        if(root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if(Math.abs(left-right) >1){
            flag = false;
        }
        return ((Math.max(left, right))+1);
    }
}
