package com;

import java.lang.reflect.Array;
import java.util.Arrays;

class pairNode implements Comparable<pairNode>{
    int num1;
    int num2;

    public pairNode(){}
    public pairNode(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    @Override
    public String toString() {
        return "pairNode{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    @Override
    public int compareTo(pairNode o) {

        return this.num1 - o.num1;
    }
}

public class checking {
    public static void main(String[] args) {

        int [] arr1 = {5,50,92,21,24,70,17,63,30,53};
        int [] arr2 = {68,100,3,99,56,43,26,93,55,25};
        int [] arr3 = {96,3,55,30,11,58,68,36,26,1};

        System.out.println(maxProfitAssignment(arr1,arr2,arr3));

    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        pairNode [] arr = new pairNode[difficulty.length];

        for(int i = 0 ; i < difficulty.length; i++){
            arr[i] = new pairNode(difficulty[i], profit[i]);
        }
        Arrays.sort(arr);
        int total = 0;
        for(int i : worker){
            int index = helper(arr,i);
            int profit_ = 0;
            for(int j = 0; j < index; j++){
                if(arr[j].num2 > profit_){
                    profit_ = arr[j].num2;
                }
            }
            total += profit_;
        }
        return total;
    }

    public static int helper(pairNode [] arr, int target){

        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid].num1 <= target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
}
