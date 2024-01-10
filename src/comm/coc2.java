package comm;

import java.util.Scanner;

public class coc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            long [] arr = new long[3];
            long max = Integer.MIN_VALUE;
            long equal = 0;

            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextLong();
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            for (int i = 0; i < 3; i++) {
                if (arr[i] == max){
                    equal++;
                }
            }

            if (equal == 1) {
                for (int i = 0; i < 3; i++) {
                    if (arr[i] == max) {
                        arr[i] = 0;
                    } else {
                        arr[i] = max - arr[i] + 1;
                    }
                }

            }
            else if (equal == 3){
                for (int i = 0; i < 3; i++) {
                    arr[i] = arr[i] + 1;
                }
            }
            else {
                for (int i = 0; i < 3; i++) {
                    if (arr[i] == max){
                        arr[i] = 1;
                    }else{
                        arr[i] = max - arr[i] + 1;
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
