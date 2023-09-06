package comm;

//  Amazon Question

class Cyclic_Sort_MissingNumber {
    public static void main(String[] args) {
        int [] arr = {0,1};
        System.out.println(MissingNumber(arr));
    }
    public static int MissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                SwapArray(arr,i,correct);
            }
            else {
                i++;
            }
        }
        //  Search For first missing number
        for (int j = 0; j < arr.length; j++) {
            //  Case 1
            if (arr[j] != j){
                return j;
            }
        }
        //  Case 2
        return arr.length;
    }
    public static void SwapArray(int [] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}