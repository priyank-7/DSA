package comm;

class DLL{
    String url;
    DLL pre;
    DLL next;

    public DLL(){}

    public DLL(String url){
        this.url = url;
        this.pre = null;
        this.next = null;
    }
    public DLL(String url, DLL pre, DLL next){
        this.url = url;
        this.pre = pre;
        this.next = next;
    }
}

class BrowserHistory {

    DLL head;
    DLL current;

    public BrowserHistory(String homepage) {
        this.head = new DLL(homepage);
        this.current = this.head;
    }

    public void visit(String url) {
        current.next = new DLL(url,current,null);
        current = current.next;
    }

    public String back(int steps) {

        while(steps > 0 && current.pre != null){
            current = current.pre;
            steps--;
        }
        return current.url;
    }

    public String forward(int steps) {

        while(steps > 0 && current.next != null){
            current = current.next;
            steps--;
        }
        return current.url;
    }
}

public class Design_Browser_History {
    public static void main(String[] args) {

        BrowserHistory b = new BrowserHistory("leetcode.com");
        b.visit("google.com");
        b.visit("facebook.com");
        b.visit("youtube.com");
        System.out.println(b.back(1));
        System.out.println(b.back(1));
        System.out.println(b.forward(1));
        b.visit("linkedin.com");
        System.out.println(b.forward(2));
        System.out.println(b.back(2));
        System.out.println(b.back(7));


    }
}
