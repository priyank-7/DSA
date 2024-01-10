package comm;

public class Recursion_Length_Of_String {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(Length(s));
    }

    static int Length(String s){
        return helper(s,0,1);
    }
    static int helper(String s, int a, int b){
        try {
            if (s.substring(a, b).equals(""));
             return helper(s,a+1,b+1);
        }
        catch (Exception e){
            return a;
        }
    }
}
