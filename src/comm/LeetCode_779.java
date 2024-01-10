package comm;


                                //  TLE Error for n > 21


public class LeetCode_779 {
    public static void main(String[] args) {
        System.out.println (kthGrammar(18,2));
    }

    public static int kthGrammar(int n, int k) {
        return Integer.parseInt(String.valueOf(creteString(n,k,"0")));
    }

    public static char creteString(int n, int k, String st){

        String s = new String("");

        if (n == 1){
            return  st.charAt(k-1);
        }

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '0'){
                s += "01";
            }
            else {
                s += "10";
            }
        }

        return creteString(n-1, k, s);
    }
}
