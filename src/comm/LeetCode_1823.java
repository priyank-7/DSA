package comm;

import java.util.ArrayList;

public class LeetCode_1823 {
    public static void main(String[] args) {
        System.out.println(findTheWinner(6, 5));
    }

    public static int findTheWinner(int n, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        helper(list, k);
        return list.get(0);
    }

    static void helper (ArrayList<Integer> list, int k){

        if (list.size() == 1){
            return;
        }

        list.remove(k-1);
        System.out.println(list);

        if (list.size() - k  > 0){
            helper(list, k+k-1);
        }
        else {
            helper(list, list.size()-k+1);
        }
    }
}
