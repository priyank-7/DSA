package comm;

import java.util.ArrayList;
import java.util.List;

public class Cyclic_Sort_Find_All_Duplicate_Element {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                SwapArray(arr,i,correct);
            }
            else {
                i++;
            }
        }

        List<Integer> l = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                l.add(arr[j]);
            }
        }
        return l;
    }

    public static void SwapArray(int [] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
