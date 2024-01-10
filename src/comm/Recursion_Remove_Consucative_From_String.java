package comm;

import java.util.Arrays;

public class Recursion_Remove_Consucative_From_String {
    public static void main(String[] args) {

        //  Using StringBuilder
        StringBuilder sb = new StringBuilder("aaaaaaabbbbb");
        removeConDup(sb,0);
        System.out.println(sb);

        //  First convert string in to character array
        char[] S1 = "GeeksForGeeks".toCharArray();
        removeDuplicates(S1);

        //  Using String
        String s = "aaaaaaaaaaaabbbbbbb";
        System.out.println(removeDuplicates1(s));

    }

    //  Using StringBuilder

    static void removeConDup(StringBuilder sb, int start){

        if (start+1 == sb.length() | start == sb.length()){
            return;
        }
        if (sb.charAt(start) == sb.charAt(start+1)){
            sb.deleteCharAt(start+1);
            removeConDup(sb,start);
        }
        else {
            removeConDup(sb, start + 1);
        }
    }

    static void removeDuplicates(char[] S)
    {
        int n = S.length;

        if (n < 2) {
            return;
        }

        int j = 0;

        for (int i = 1; i < n; i++) {

            if (S[j] != S[i]) {
                j++;
                S[j] = S[i];
            }
        }
        System.out.println(Arrays.copyOfRange(S, 0, j + 1));
    }

    //  Using String

    static String removeDuplicates1(String s){
        if (s.length() < 2){
            return s;
        }

        if (s.charAt(0) == s.charAt(1)){
            return removeDuplicates1(s.substring(1));
        }
        else {
            return s.charAt(0) + removeDuplicates1(s.substring(1));
        }
    }
}
