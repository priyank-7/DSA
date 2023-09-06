package comm;

class WordFilter {

    String [] words;

    public WordFilter(String[] words) {
        this.words = words;
    }

    public int f(String pref, String suff) {
        int ans = -1;
        int max_len = 0;
        int index = 0;
        for(int i = 0; i < words.length; i++){
            String s = words[i];
            int end = pref.length();
            int start = s.length()-suff.length();

            if(end < s.length() && start >= 0){
                if(pref.equals(s.substring(0,end)) && suff.equals(s.substring(start,s.length()))){
                    if(s.length() >= max_len){
                        max_len = s.length();
                        ans = i;
                    }
                }
            }
        }
        return ans;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */

public class Prefix_And_Suffinx_Sum {
    public static void main(String[] args) {

    }


}
