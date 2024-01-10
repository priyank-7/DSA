package comm;

import java.util.Arrays;

public class Recursion_MergeSort {
    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
        Mergesort1(arr, 0, arr.length);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }


    //  In this method original array is not modified, but it returns a copy of an array
    static int[] Mergesort(int [] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int [] left = Mergesort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = Mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return Merge(left, right);
    }

    private static int [] Merge(int[] first, int [] second){
        int [] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] <second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){                           //  It may be possible that one of the arrays is not complete
            mix[k] = first[i];                              //  copy the remaining element into the mix
            i++;
            k++;
        }

        while (j < first.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }


    //  #2
    //  In place of creating new array this algo modify the given array and not returning anything
    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {                                 // it may be possible that one of the arrays is not complete
            mix[k] = arr[i];                              // copy the remaining elements
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        //  Adding in the given main array to reduce space comp.
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }

                        //  WORK IN PROGRESS

    static void Mergesort1(int [] arr, int start, int end){
        if ((end - start) == 1){
            return;
        }

        int mid = (end+start)/2;
        Mergesort1(arr,start,mid);
        Mergesort1(arr, mid, end);

        Merge1(arr, start, mid, end);
    }

    private static void Merge1(int[] arr, int start, int mid, int end){
//        int [] mix = new int[end-start];

          int i = start;
          int j = mid;
          int k = 0;

        while (i < mid && j <= end){
            if (arr[i] <arr[j]){
                i++;
            }
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

//          It may be possible that one of the arrays is not complete
//          copy the remaining element into the mix

//        while (i < mid){
//
//            mix[k] = arr[i];
//            i++;
//            k++;
//        }

//        while (j < end){
//            mix[k] = arr[j];
//            j++;
//            k++;
//        }

//        for (int l = 0; l < mix.length; l++) {
//            arr[start+l] = mix[l];
//        }
    }
}
