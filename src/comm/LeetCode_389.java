package comm;

public class LeetCode_389 {
    public static void main(String[] args) {
        String t = "";
        String s = "y";
        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (t.charAt(i) == sb.charAt(j)){
                    sb.deleteCharAt(j);
                    break;
                }
            }
        }
        return sb.charAt(0);
    }
}
