package comm;

import java.util.Stack;

public class MinimumSpeedToArrivOnTime {
    public static void main(String[] args) {
        int [] arr = {1,1,100000};
        System.out.println(minSpeedOnTime(arr,2.01));
    }


    public static int minSpeedOnTime(int[] dist, double hour) {

        long sum = 0;
        for(int i : dist){
            sum += i;
        }

        return (int)bin(dist,hour,1,(int)Math.pow(10,9));


    }

    public static long bin(int [] arr, double hour, long start, long end){

        long ans = -1;

        while(start <= end){
            long mid = (start+end)/2;

            double hr = 0;
            double last = 0;
            for(int i : arr){
                last = (double) i/mid;
                hr += Math.ceil(last);
            }
            hr = hr-Math.ceil(last) + last;

            if(hr <= hour){
                ans = mid;
                end = mid - 1;

            }

            else{
                start = mid + 1;
            }
        }
        return ans;

    }
}
