package comm;

public class Recursion_Count_Zero {

    //  #1
    static int count_ = 0;
    static int Count1(int n){
        if (n % 10 == 0){
            count_++;
        }
        if (n % 10 == n){
            return count_;
        }
        return Count1(n/10);
    }

    //  #2
    static int Count2(int n){
        return helper(n,0);
    }
    static int helper(int n, int count){

        if (n%10 == 0){
            count++;
        }
        if (n % 10 == n){
            return count;
        }
        return helper(n/10,count);
    }

    public static void main(String[] args) {
        System.out.println(Count2(30210004));
        System.out.println(Count1(30210004));
    }
}
