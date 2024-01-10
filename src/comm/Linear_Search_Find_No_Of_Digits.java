package comm;

import java.util.Scanner;

public class Linear_Search_Find_No_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        if(a== 0){
            System.out.println(1);
        }
        else {
            System.out.println((int) Math.log10(a) + 1);
        }
    }
}
