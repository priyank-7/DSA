package comm;

public class Recursion_Power_Of_X {
    public static void main(String[] args) {
        System.out.println(PowerOf2(16));
        System.out.println(PowerOf3(81));
        System.out.println(PowerOf4(0));
    }

    public static boolean PowerOf2(double n){
        if (n < 1){
            return false;
        }
        if (n == 1){
            return true;
        }
        return PowerOf2(n/2.0);
    }

    public static boolean PowerOf3(double n){
        if (n < 1){
            return false;
        }
        if (n == 1){
            return true;
        }
        return PowerOf3(n/3.0);
    }

    public static boolean PowerOf4(double n){
        if (n < 1){
            return false;
        }
        if (n == 1){
            return true;
        }
        return PowerOf4(n/4.0);
    }
}
