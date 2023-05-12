package com;

public class daily {
    public static void main(String[] args) {

    }

    public static boolean hell(int [] arr, int k){

        int x = 0;
        int count = 0;
        boolean flag = false;
        if(arr[0] == 0){
            flag = true;
        }

        for(int i : arr){
            if(i == 1){
                if(flag){
                    x += count/2;
                    flag = false;
                }
                else if(count % 2 == 0){
                    x += (count-1)/2;
                }
                else{
                    x += count/2;
                }
                count = 0;
            }
            else{
                count++;
            }
        }
        x += count/2;

        if(x >= k){
            return true;
        }
        return false;
    }
}
