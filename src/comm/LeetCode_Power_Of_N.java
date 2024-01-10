package comm;


                        //  Getting Stack Over Flow Error


public class LeetCode_Power_Of_N {
    public static void main(String[] args) {
        System.out.println(myPow(2.1,3));
    }

    public static double myPow(double x, int n) {

        if (n == 0){
            return 1;
        }
        if (n < 0){
            return 1 / myPow(x, -n);
        }
        if (n % 2 == 1){
            return x * myPow(x, n-1);
        }
        return myPow(x * x, n/2);
    }
}
