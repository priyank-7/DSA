package com;

public class Patterns {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(5);
        pattern5(5);
        pattern28(5);
        pattern30(5);
        pattern31(4);
    }

    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = n; i > 0; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i < 2*n; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for (int j = 2*n-i; j > 0; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    static void pattern28(int n) {
        for (int i = 1; i < 2*n; i++) {
            if (i <= n) {
                int spaces = n-i;
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                int space = i-n;
                for (int j = 1; j <= space  ; j++) {
                    System.out.print(" ");
                }
                for (int j = 2*n-i; j > 0; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern30 (int n){
        for (int i = 1; i < 2*n; i++) {
            if(i <= n) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j+" ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j+ " ");
                }
            }
            else{
                for (int j = 1; j <= i-n; j++) {
                    System.out.print("  ");
                }
                for (int j = 2*n-i; j > 0 ; j--) {
                    System.out.print(j+" ");
                }
                for (int j = 2; j <= 2*n-i; j++) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2*n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int atEveryIndex = originalN-Math.min(Math.min(i,j),Math.min(n-i-1,n-j-1));
                System.out.print(atEveryIndex+"  ");
            }
            System.out.println();
        }
    }
}

