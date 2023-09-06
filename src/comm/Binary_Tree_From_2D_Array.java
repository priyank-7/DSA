package comm;


import java.util.HashMap;

class MapNode{

        int val;
        MapNode left;
        MapNode right;

        public MapNode(int val){
                this.val = val;
                this.left = null;
                this.right = null;
        }
}


public class Binary_Tree_From_2D_Array {
    public static void main(String[] args) {

    }

    public static TreeNode createBinaryTree(int[][] descriptions) {

        HashMap<Integer,MapNode> map = new HashMap<>();

        for(int [] i : descriptions){

            if(map.containsKey(i[0])){
                if(i[2] == 1){
                    map.get(i[0]).left = new MapNode(i[1]);
                }
                else{
                    map.get(i[0]).right = new MapNode(i[1]);
                }
            }
            else{
                map.put(i[0],new MapNode(i[0]));
                if(i[2] == 1){
                    map.get(i[0]).left = new MapNode(i[1]);
                }
                else{
                    map.get(i[0]).right = new MapNode(i[1]);
                }
            }
        }

            return new TreeNode();


    }


}
