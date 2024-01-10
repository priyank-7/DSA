package comm;

public class Linear_Search_InString {
    public static void main(String[] args) {
        String name = "Priyank";
        char target = 'a';
        System.out.println(search(name,target));

    }


    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        return false;
    }

//    static boolean search(String str, char target){
//        if(str.length() == 0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == target){
//                return true;
//            }
//        }
//        return false;
//    }
}
