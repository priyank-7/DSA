package comm;

import java.util.Arrays;

public class LeetCode_1313 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(arr)));

    }

    public static int[] decompressRLElist(int[] nums) {

        int len = 0;

        for(int i = 0; i< nums.length; i+=2){
            len += nums[i];
        }

        int [] arr = new int [len];

        int ind = 0;

        for(int i = 0; i < nums.length-1; i+=2){
            int temp1 = nums[i];
            int temp2 = nums[i+1];
            while(temp1 -- > 0){
                arr[ind] = temp2;
                ind++;
            }
        }
        return arr;
    }


//    public static int compress(char[] chars) {
//
//        if(chars.length == 1){
//            return 1;
//        }
//        int length = 0;
//
//        for(int i = 0; i < chars.length-1; i++){
//            if(chars[i] == chars[i+1]){
//                int temp = 2;
//                for(int j = i+1; i < chars.length-1; i++){
//                    if(chars[i] == chars[i+1]){
//                        temp++;
//                    }
//                    else{
//                        break;
//                    }
//                }
//                length += helper_(temp) + 1;
//            }
//            else {
//                length++;
//            }
//        }
//        return length;
//
//    }
//
//    public static int helper (char[] ch, int j){
//        int temp = 0;
//        for(int i = j; i < ch.length-1; i++){
//            if(ch[i] == ch[i+1]){
//                temp = i;
//            }
//        }
//
//        return temp;
//    }
//
//    public static int helper_ (int n){
//        int count = 0;
//        while (n > 0){
//            count++;
//            n = n/10;
//        }
//        return count;
//    }
}
