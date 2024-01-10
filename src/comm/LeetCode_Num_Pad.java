package comm;

import java.util.ArrayList;

public class LeetCode_Num_Pad {
    public static void main(String[] args) {
        System.out.println(CombinationReturn("", ""));
    }

    public static ArrayList<String> CombinationReturn(String p, String up){

        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = (up.charAt(0) - '0') - 1;

        if (digit == 6){
            for (int i = (digit-1)*3; i <= digit*3; i++) {
                char ch = (char) ('a'+i);
                list.addAll(CombinationReturn(p + ch,up.substring(1)));
            }
        }
        else if (digit == 7){
            for (int i = ((digit-1)*3) + 1; i <= digit*3; i++) {
                char ch = (char) ('a'+i);
                list.addAll(CombinationReturn(p + ch,up.substring(1)));
            }
        }
        else if (digit == 8){
            for (int i = ((digit -1)*3) + 1; i <= digit*3 + 1; i++) {
                char ch = (char) ('a'+ i);
                list.addAll(CombinationReturn(p+ch,up.substring(1)));
            }
        }
        else {
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(CombinationReturn(p + ch, up.substring(1)));
            }
        }

        return list;
    }
}
