package comm;

public class Sum_root_To_Leaf_Node {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(5),new TreeNode(1,null,new TreeNode(6)));

        System.out.println(sumNumbers(root));
    }

    public static int sumNumbers(TreeNode root) {
        return helper(root, 0, 0);
    }

    public static int helper(TreeNode root, int sum, int total){

        if(root.left == null && root.right == null){
            sum = (sum*10) + root.val;
            return total + sum;
        }
        sum = (sum*10) + root.val;
        if(root.left != null){
            total = helper(root.left, sum, total);
        }
        if(root.right != null){
            total = helper(root.right, sum,total);
        }
        return total;
    }
}
