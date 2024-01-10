package comm;

import java.util.Scanner;

//class TreeNode {
//    public int data;
//    public TreeNode left;
//    public TreeNode right;
//
//    public TreeNode(){
//        this.left = null;
//        this.right = null;
//    }
//
//    public TreeNode(int data){
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}

class tree{

    Scanner sc = new Scanner(System.in);
    TreeNode root;

    public tree(){
         this.root = null;
    }

    public TreeNode createTree(int data){

        if(data == -1){
            return null;
        }
        TreeNode root = new TreeNode(data);
        System.out.println("Enter left data");
        createTree(sc.nextInt());
        System.out.println("Enter right data");
        createTree(sc.nextInt());

        return root;
    }

    public void levelordertraverser(TreeNode root){

    }

}
public class Trees_BinaryTree_Babbar {
    public static void main(String[] args) {

        TreeNode n1 = new TreeNode();
        tree t = new tree();
        t.createTree(1);

    }
}
