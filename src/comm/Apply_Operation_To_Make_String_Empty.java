package comm;

import java.util.Arrays;
import java.util.Map;

public class Apply_Operation_To_Make_String_Empty {
    public static void main(String[] args) {
        System.out.println(helper("aabcbbca"));
    }

    public static String helper(String s) {
        int [] count = new int [26];
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 97;
            int mx = count[index];
            count[index] = mx+1;
            max = Math.max(max,mx+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() -1; i >= 0; i--){
            char c = s.charAt(i);
            if(count[c - 97] == max){
                sb.append(c);
            }
            count[c - 97]--;
        }
        return sb.reverse().toString();
    }
}
