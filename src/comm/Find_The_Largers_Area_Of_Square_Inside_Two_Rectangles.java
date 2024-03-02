package comm;

public class Find_The_Largers_Area_Of_Square_Inside_Two_Rectangles {
    public static void main(String[] args) {
        int [][] bl = {{1,1},{3,3},{3,1}};
        int [][] tr = {{2,2},{4,4},{4,2}};
        System.out.println(largestSquareArea(bl,tr));

    }

    public static long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        return helper(bottomLeft, topRight);
    }

    public static long helper(int [][] bl, int [][] tr){
        long area = 0;
        int bx = 0;
        int by = 0;
        int tx = 0;
        int ty = 0;

        for(int i=0; i< tr.length-1; i++){
            for(int j = i; j < bl.length; j++){
                if(i != j){
                    bx = bl[j][0];
                    by = bl[j][1];
                    tx = tr[i][0];
                    ty = tr[i][1];
                    int difx = tx-bx;
                    int dify = ty-by;

                    if((difx <= 0 && dify <= 0) || (difx >= 0 && dify >= 0)){
                        int area1 = Math.abs(difx) * Math.abs(dify);
                        if(Math.abs(difx)==Math.abs(dify) &&  area < area1){
                            area = area1;
                        }
                    }
                }
            }
        }
        return area;
    }
}
