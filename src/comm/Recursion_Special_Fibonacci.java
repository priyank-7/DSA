package comm;

import java.util.Scanner;

public class Recursion_Special_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(sf(n,a,b));
        }
    }

    public static int sf(int n, int a, int b){
        if (n == 0){
            return a;
        }
        if (n == 1 ){
            return b;
        }
        return sf(n-1,a,b)^sf(n-2,a,b);
    }
}
