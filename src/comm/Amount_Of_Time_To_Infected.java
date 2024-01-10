package comm;

import java.util.*;
import java.util.function.Function;

public class Amount_Of_Time_To_Infected {
    public static void main(String[] args) {
        amountOfTime(new TreeNode(1,new TreeNode(2),new TreeNode(3)), 2);
    }

    public static int amountOfTime(TreeNode root, int start) {
        return helper(root, start);
    }
    public static int helper(TreeNode root, int start){
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        Map<TreeNode, Boolean>  isEffected = new HashMap<>();
        parent = bfs(root, parent);
        isEffected = status(root, start, isEffected);
        TreeNode node = findNode(root, start);
        return effectionTIme(parent,isEffected, node);
    }

    public static Map<TreeNode,TreeNode> bfs (TreeNode root, Map<TreeNode,TreeNode> parent){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode temp = root;

        while(!q.isEmpty()){
            temp = q.remove();
            if(temp.left != null){
                TreeNode finalTemp = temp;
                parent.computeIfAbsent(temp.left, p -> finalTemp);
                q.add(temp.left);
            }
            if(temp.right != null){
                TreeNode finalTemp = temp;
                parent.computeIfAbsent(temp.right, p -> finalTemp);
                q.add(temp.right);
            }
        }
        return parent;
    }

    public static Map<TreeNode, Boolean> status (TreeNode root,int start, Map<TreeNode, Boolean> isEffected){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode temp = root;

        while(!q.isEmpty()){
            temp = q.remove();
            if(temp.val != start){
                isEffected.computeIfAbsent(temp, p -> true);
            }
            else{
                isEffected.computeIfAbsent(temp, p -> false);
            }
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        return isEffected;
    }

    public static TreeNode findNode(TreeNode root, int start){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode temp = root;

        while(!q.isEmpty()){
            temp = q.remove();
            if(temp.val == start){
                return temp;
            }
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        return temp;
    }

    public static int effectionTIme (Map<TreeNode,TreeNode> parent, Map<TreeNode,Boolean> status, TreeNode node){
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> tq = new LinkedList<>();
        q.add(node);
        TreeNode temp = node;
        int count = 0;

        while(!q.isEmpty()){
            while(!q.isEmpty()){
                temp = q.remove();
                if(temp.left != null && status.get(temp.left)){
                    tq.add(temp.left);
                    status.put(temp.left,false);
                }
                if(temp.right != null && status.get(temp.right)){
                    tq.add(temp.right);
                    status.put(temp.right,false);
                }
                if(parent.get(temp) != null && status.get(parent.get(temp))){
                    tq.add(parent.get(temp));
                    status.put(parent.get(temp),false);
                }
            }
            while(!tq.isEmpty()){
                q.add(tq.remove());
            }
            count++;
        }
        return count-1;
    }
}

