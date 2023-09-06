package comm;

//  Google Question

import java.util.ArrayList;
import java.util.List;

class Cyclic_Sort_Find_Disappeared_Number {
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,2,4,5,4,2,4};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        CyclicSort(arr);
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= i+1){
                l.add(i+1);
            }
        }
        return l;
    }

    public static void CyclicSort(int [] arr){
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
    }

    public static void SwapArray(int [] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}