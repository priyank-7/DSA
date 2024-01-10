package comm;

public class Recursion_Strings {
    public static void main(String[] args) {
//        skip("","baccdah");
//        System.out.println(skip("baccdah"));
        System.out.println(skipAppNotApple("aweappsfs"));
    }

    //  Not returning anything
    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch, up.substring(1));
        }
    }

    //  Returning a String
    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            return skip(up.substring(1));
        }
        else {
            return ch + skip(up.substring(1));
        }
    }

    //  Remove a sub string
    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    //  Remove a string at some condition
    static String skipAppNotApple(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
