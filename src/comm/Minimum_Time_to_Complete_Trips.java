package comm;

public class Minimum_Time_to_Complete_Trips {
    public static void main(String[] args) {

        int [] arr = {9,7,9,10,9,10,9};
        System.out.println(minimumTime(arr,1));
    }

        public static long minimumTime(int[] time, int tt) {

            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            for(int i : time){
                if(i < min){
                    min = i;
                }
                if(i > max){
                    max = i;
                }
            }

            return (int) bin(min, max*tt, tt, time);


        }

        public static long bin (long start, long end, int tt, int [] arr){

            while(start <= end){

                long mid = start - (long)(Math.ceil((start-end)/2.0));

                long sum = 0;
                for(int i : arr){
                    sum += mid / i;
                }
                // System.out.println(sum);

                if(sum == tt){
                    return mid;
                }
                if(sum < tt){
                    start = mid + 1;
                }
                if(sum > tt){
                    end = mid - 1;
                }
            }
            return start;

        }

        // public static void sum (int [] arr, int x){

        //     long sum = Long.MIN_VALUE;
        //     for(int i : arr){
        //         sum += i*x;
        //     }
        //     return sum;
        // }
}
