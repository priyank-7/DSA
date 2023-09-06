package comm;

public class Recursion_Reverse_The_Number {

    //  #1
    static int sum=0;
    static void Rev_1(int n) {
        if (n==0){
            return;
        }
        int reminder = n%10;
        sum = sum*10 + reminder;
        Rev_1(n/10);
    }

    //  #2
    static int Rev_2(int n) {
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


    public static void main(String[] args) {
        Rev_1(1234);
        System.out.println(sum);
        System.out.println(Rev_2(5234));
    }
}
