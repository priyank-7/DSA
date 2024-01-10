package comm;

public class Flatten_Binary_Tree_To_LinkedList {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        flatten(root);
    }

    public static void flatten(TreeNode root) {
        TreeNode current = root;
        while(current != null){
            System.out.println(root.left.val);
            System.out.println(root.right.val);
            System.out.println(current.left.val);
            System.out.println(current.right.val);
            if(current.left != null){
                TreeNode temp = current.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
}
