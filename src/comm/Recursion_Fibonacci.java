package comm;

public class Recursion_Fibonacci {
    public static void main(String[] args) {
//        int f = Fibonacci(50);
//        System.out.println(f);
        for (int i = 0; i < 50; i++) {
            System.out.println(FibonacciFormula(i));
        }
    }

    //  Find n th fibonacci number using golden ratio formula
    //  for n th Fibonacci number
    static int FibonacciFormula(int n){
        //  return (int) ((Math.pow((1+Math.sqrt(5))/2.0,n) - Math.pow((1-Math.sqrt(5))/2.0,n))/Math.sqrt(5));
        //  or
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }

    //  Using recursion
    static int Fibonacci(int n){
        //  Base Condition
        if(n<2){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
