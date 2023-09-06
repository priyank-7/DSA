package comm;

public class LeetCode_459 {
    public static void main(String[] args) {

        System.out.println(repeatedSubstringPattern("aba"));

    }

    public static boolean repeatedSubstringPattern(String s) {
        String str = null;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            str = s.substring(0,i+1);
            for(int j = i+1; j < s.length(); j = j + i + 1){
                if((j+i+1) <= s.length() && str.equals(s.substring(j,j+i+1))){
                    count++;
                }
                else{
                    count = -1;
                    break;
                }
            }
            if(i+1 != s.length() &&count != -1 && (count+1) * str.length() == s.length()){
                return true;
            }
            count = 0;
        }
        return false;
    }

    public static boolean helper (String s){
        char [] a = new char[1];


        for (int i = 1; i <= s.length()/2; i++) {
            if (s.length() % i == 0){
                if (s.substring(i, s.length()-i).equals(s.substring(i))){
                    return true;
                }
            }
        }
        return false;
    }
}
