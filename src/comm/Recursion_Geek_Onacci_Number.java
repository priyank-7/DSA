package comm;

import java.util.Scanner;

public class Recursion_Geek_Onacci_Number {
    static int a;
    static int b;
    static int c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(gn(2));
        }
    }

    static int gn(int n){
        if (n == 1){
            return a;
        }
        if (n == 2){
            return b;
        }
        if (n == 3){
            return c;
        }
        return gn(n-1)+gn(n-2)+gn(n-3);

    }
}
