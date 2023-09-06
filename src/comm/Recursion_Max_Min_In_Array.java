package comm;

public class Recursion_Max_Min_In_Array {
    public static void main(String[] args) {
        int [] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(f1(arr));
        System.out.println(f2(arr));
        char [] c = {'h','e','l','l','o'};
        f3(c);
    }

    //  Max
    static int f1 (int [] arr){
        return Max(arr,arr.length-1);
    }

    static int Max (int [] arr, int n){
        if (n == 1){
            return arr[0];
        }
        return Math.max(arr[n], Max(arr,n-1));
    }

    //  Min
    static int f2 (int [] arr){
        return Min(arr,arr.length-1);
    }

    static int Min (int [] arr, int n){
        if (n == 1){
            return arr[0];
        }
        return Math.min(arr[n], Min(arr,n-1));
    }

    //  Reverse a String
    public static void f3 (char [] c){
        Reverse(c,0);
    }
    public static void Reverse(char [] c, int n){
        if (n == c.length-1){
            System.out.print(c[n]);
            return;
        }
        Reverse(c,n+1);
        System.out.print(c[n]);
    }
}
