package comm;

import java.util.Stack;

public class Construct_BinTree_From_In_Post_Order {
    public static void main(String[] args) {
        int [] inorder = {9,3,15,20,7};
        int [] postorder = {9,15,7,20,3};

        System.out.println(buildTree(inorder,postorder).val);
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        int right_ind = postorder.length-1;
        int t = postorder[right_ind];

        TreeNode root = new TreeNode(t);

        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        root = temp;
        st.add(root);

        while(!st.empty()){
            temp = st.pop();
            int in_ind = inorder_index(inorder, temp.val);
            int post_ind = postorder_index(postorder, temp.val);

            temp.left = helper1(inorder, postorder, in_ind, post_ind);
            if(temp.left != null){
                st.add(temp.left);
            }

            temp.right = helper2(inorder, postorder,in_ind, post_ind);
            if(temp.right != null){
                st.add(temp.right);
            }
        }
        return root;

    }

    public static TreeNode helper2(int [] inorder, int [] postorder, int in_ind, int post_ind) {
        int right = post_ind-1;
        if(right-1 > 0){
            for(int i = in_ind; i < inorder.length; i++){
                if(inorder[i] == postorder[right]){
                    return new TreeNode(postorder[right]);
                }
            }
        }
        return null;
    }
    public static TreeNode helper1(int [] inorder, int [] postorder, int in_ind, int post_ind) {
        int left = post_ind-2;
        if(left > 0){
            for(int i = in_ind; i >= 0; i--){
                if(inorder[i] == postorder[left]){
                    return new TreeNode(postorder[left]);
                }
            }
        }
        return null;
    }

    public static int inorder_index(int [] inorder, int val){
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == val){
                return i;
            }
        }
        return -1;
    }

    public static int postorder_index(int [] postorder, int val){
        for(int i = 0; i < postorder.length; i++){
            if(postorder[i] == val){
                return i;
            }
        }
        return -1;
    }
}
