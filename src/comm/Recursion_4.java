package comm;

public class Recursion_4 {
    public static void main(String[] args) {
        fun(5);
        fun1(5);
    }

        //  Distending order
    static void fun(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

        //  Ascending order
    static void fun1(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        fun1(n-1);
        System.out.println(n);
    }


}
