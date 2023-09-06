package comm;

public class Recursion_Number_Pelimdrome {

    static int Rev(int n) {
        //  Sometimes you might need some additional variable in the argument int that case make another function
        int digits = (int) Math.log10(n)+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits){
        if (n % 10 == n){
            return n;
        }
        int reminder = n%10;
        return reminder * (int) Math.pow(10,digits-1) + helper(n/10,digits-1);
    }

    static boolean Palindrome(int n){
        return n == Rev(n);
    }

    public static void main(String[] args) {
        System.out.println(Palindrome(12321));
    }
}
