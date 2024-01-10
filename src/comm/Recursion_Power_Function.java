package comm;

public class Recursion_Power_Function {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }

    public static double power(int n, int p) {

        if (p == 0){
            return 1;
        }
        if (p < 0){
            return 1/power(n,Math.abs(p));
        }
        if (p%2 != 0){
            return n * power(n,p-1);
        }
        return power(n*n, p/2);
    }

}
