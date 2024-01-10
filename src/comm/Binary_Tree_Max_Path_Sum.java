package comm;

public class Binary_Tree_Max_Path_Sum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        System.out.println(helper(root, 0, Integer.MIN_VALUE));
    }

    public static int helper(TreeNode root, int sum ,int max){
        if(root.left == null && root.right == null){
            sum += root.val;
            if(sum > max){
                max = sum;
            }
        }

        sum = sum + root.val;

        if(root.left != null){
            max = helper(root.left,sum ,max);
        }
        if(root.right != null && root.left !=  null){
            max = helper(root.right, sum+root.left.val, max);
        }
        else if(root.right != null){
            max = helper(root.right, sum, max);
        }
        return max;
    }
}
