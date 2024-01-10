package comm;

import java.util.ArrayList;
import java.util.Scanner;

public class coc1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0){
                int n = sc.nextInt();


                ArrayList<Integer> arr = new ArrayList<>(n);

                for (int i = 0; i < n; i++) {
                    arr.add(sc.nextInt());
                }

                if (helper(arr)){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }


        public static boolean helper (ArrayList<Integer> arr){


            int templength = Integer.MIN_VALUE;

            for (int i = 0; i < arr.size() - 1; i=i+1-1) {
                if (templength == arr.size()){
                    return false;
                }
                templength = arr.size();
                for (int j = 1; j < arr.size(); j++) {
                    if (Math.abs(arr.get(i) - arr.get(j)) <= 1) {
                        arr.remove(i);
                    }
                }
            }
            return true;
        }

}
