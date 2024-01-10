package comm;

public class Convert_Sorted_Array_To_Binary_tree {
    public static void main(String[] args) {

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return find(0, nums.length-1, nums);
    }

    TreeNode find(int start, int end, int [] arr){
        int mid = start+(end-start)/2;
        if(start > end){
            return null;
        }
        TreeNode root = new TreeNode(arr[mid]);
        root.left = find(start, mid-1, arr);
        root.right = find(mid+1, end, arr);
        return root;
    }
}
