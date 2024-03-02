package comm;

public class Count_Prifix_And_Suffix_Pair_1 {
    public static void main(String[] args) {
        String [] arr = {"abab", "ab"};
        System.out.println(countPrefixSuffixPairs(arr));
        StringBuilder sb = new StringBuilder();
        sb.length();
        sb.reverse();
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length-1; i++){
            for(int j = i+1; j < words.length; j++){
                if(i!=j){
                    if(isPrefixAndSuffix(words[i], words[j])){
                        count++;
                    }
                }
            }
        }
        return count;

    }

    public static boolean isPrefixAndSuffix(String s1, String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        int l1 = s1.length();
        int l2 = s2.length();

        if( s2.substring(0,l1).equals(s1) && s1.equals(s2.substring(l2-l1,l2))){
            return true;
        }
        return false;
    }
}
