package comm;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_22 {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        System.out.println(helper(3,"",l));
    }

    static List<String> helper(int n, String s, ArrayList<String> list){

        if (s.length() == 2*n){
            list.add(s);
            return list;
        }

        helper(n, s+"(", list);
        helper(n, s+")", list);

        return list;
    }
}
