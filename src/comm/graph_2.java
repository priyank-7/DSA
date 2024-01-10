package comm;

import java.util.ArrayList;

public class graph_2 {
    public static void main(String[] args) {

    }

    public void helper(int n, int m, ArrayList<ArrayList<Integer>> edges){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);

            ans.set(u,v);
            ans.set(v,u);
        }

        System.out.println(ans);
    }
}
