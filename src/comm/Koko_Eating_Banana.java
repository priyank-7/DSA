package comm;

public class Koko_Eating_Banana {
    public static void main(String[] args) {

        int [] arr = {312884470};
        System.out.println(minEatingSpeed(arr,312884469));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long sum = 0;

        for(int i : piles){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
            sum += i;
        }

        sum = bin(piles,h, 1, sum);
        return  (int)(sum);
    }

    public static long bin(int [] arr, int h, long start, long end){


        long ans = 0;

        while(start <= end){
            long mid = (start + end)/2;

            long hours = 0;
            for(int i : arr){
                hours += (long)(Math.ceil((float)i/(float)mid));
            }
            if(hours <= h){
                ans = mid;
            }
            if(hours <= h){
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}
