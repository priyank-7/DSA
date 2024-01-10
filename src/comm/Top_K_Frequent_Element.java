package comm;

import java.util.Arrays;
import java.util.HashMap;

public class Top_K_Frequent_Element {
    public static void main(String[] args) {
        int [] arr = {1};
        System.out.println(Arrays.toString(topKFrequent(arr,1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        for(int i = 0; i < k; i++){
            int max = 0;
            for(int j : map.keySet()){
                if(map.get(j) > max){
                    max = map.get(j);
                    nums[i] = j;
                }
            }
            map.remove(nums[i]);
        }
        return Arrays.copyOfRange(nums,0, k);
    }
}
