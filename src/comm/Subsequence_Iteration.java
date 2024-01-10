package comm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence_Iteration {
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        System.out.println(subsetDuplicate(arr));
    }

    //  For nonDuplicate element
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    //  For Duplicate Element
    static List<List<Integer>> subsetDuplicate(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int j = 0; j < arr.length; j++) {
            start = 0;
            //  if current and previous element is same, start = ens + 1
            if (j > 0 && arr[j] == arr[j-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
