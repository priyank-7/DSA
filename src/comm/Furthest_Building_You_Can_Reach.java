package comm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Furthest_Building_You_Can_Reach {
    public static void main(String[] args) {

    }

    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        PriorityQueue<Integer> pd = new PriorityQueue<>();

        for (int i = 0; i < heights.length-1; i++){
            if(heights[i] < heights[i+1]){
                pd.add(heights[i] - heights[i+1]);



            }
        }
        return 0;
    }


}
