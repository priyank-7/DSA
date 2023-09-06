package comm;

public class LeetCode_560 {
    public static void main(String[] args) {
        int [] arr = { 1,2,3};
        System.out.println(helper(arr, 3));
    }

    static int helper (int [] arr, int k){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k ){
                    count ++;
                    break;
                }
            }
        }
        if (sum == k){
            count++;
        }
        return count;
    }
}
