package comm;

import java.util.ArrayList;

public class Recursion_Concept {
    public static void main(String[] args) {
        Concept(5);

        System.out.println("AB".equals("BA"));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.contains(1));
    }

    //                  n-- vs  --n
     static void Concept(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
//        fun(n--);         /// This will become Infinite loop Because it always passes the value of n which is given at the first call of the function
        Concept(--n);
    }
}
