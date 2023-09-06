package comm;

public class Cyclic_Sort_Smallest_Missing_Positive_Integer {
    public static void main(String[] args) {

    }

    public static int SmallestMissingPositiveInteger(int [] arr){
        CyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }

    public static void CyclicSort(int [] arr){
        int i = 0;
        while(i<arr.length){

            if(arr[i]>0){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct] && arr[i] <arr.length){
                    Swap(arr,i,correct);
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
    }

    public static void Swap(int [] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
