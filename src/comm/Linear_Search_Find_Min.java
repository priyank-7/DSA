 package comm;

public class Linear_Search_Find_Min {
    public static void main(String[] args) {
        int [] arr = {18,12,7,3,68,3,6,8,9,4};
        System.out.println(min(arr));
    }static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
