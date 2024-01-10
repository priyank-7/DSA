package comm;

public class LeetCode_2580 {
    public static void main(String[] args) {
//        int [][] arr = {{30,54},{74,79},{29,37},{126,127},{36,56},{116,133},{15,36},{82,113},{7,30},{89,137},{22,51},{74,129}};

        int [][] arr = {{1,3},{10,20},{2,5},{4,8}};
        System.out.println(countWays(arr));
    }



    public static int countWays(int[][] arr) {

        boolean [] ck = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){

            int a1 = arr[i][0];
            int b1 = arr[i][1];

            for(int j = i+1; j < arr.length; j++){
                int a2 = arr[j][0];
                int b2 = arr[j][1];

                if( (a2 <= a1 && a1 <= b2) ||
                        (a2 <= b1 && b1 <= b2) ||
                        (a1 <= a2 && a2 <= b1) ||
                        (a1 <= b2 && b2 <= b1)
                ){
                    if( !(ck[i] && ck[j]) ){
                        if(ck[j]) {
                            ck[i] = true;
                        }
                        else {
                            ck[j] = true;
                        }
                        }
                    }
                }
            }
        int count = 0;
        for (boolean b:
        ck){
            if (!b){
                count++;
            }
        }
        return (int)Math.pow(2,count) % ((int)Math.pow(10,9) + 7);
    }
}

