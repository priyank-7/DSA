package comm;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {

        int [] arr = {4,5,2,1,3};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //  Here i is less than [  arr.length-1  ] because [  j=i+1  ] for j if [  i=n-1  ], [  j=n  ] and this gives you IndexOutOfBound error
            for (int j = i+1; j >0 ; j--) {
                //  Here j is always greater than 0 because if [  j=0  ] then [  (j-1) = -1  ] this will give you IndexOutOfBound error
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
