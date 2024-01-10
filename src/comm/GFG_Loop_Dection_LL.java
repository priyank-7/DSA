package comm;

class Node_{
    int data;
    Node_ next;

    public Node_(int data){
        this.data = data;
    }
}
public class GFG_Loop_Dection_LL {
    public static void main(String[] args) {

        Node_ n1 = new Node_(1);
        Node_ n2 = new Node_(2);
        Node_ n3 = new Node_(3);
        Node_ n4 = new Node_(4);
        Node_ n5 = new Node_(5);
        Node_ n6 = new Node_(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n1;


        Node_ temp = n1;
//        while(temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
        removeLoop(n1);
        temp = n1;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void removeLoop(Node_ head){

        if (chekLoop(head)){
            int ll = loopLength(head);

        }

    }

    static int f_l(Node_ head, Node_ slow){
        Node_ temp = head;
        int l = 0;
        do {
            temp = temp.next;
            l++;
        }while (temp != slow);

        return l;
    }

    public static boolean chekLoop(Node_ head){
        Node_ fast = head;
        Node_ slow = head;

        if (fast.next == null || fast.next.next == null){
            return false;
        }

        do {
            if (fast.next == null || fast.next.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }while (slow != fast);

        return true;
    }

    static int loopLength(Node_ head){

        Node_ fast = head;
        Node_ slow = head;
        int len = 0;

        do {
            slow = slow.next;
            len++;
        }while (slow != fast);

        return len;
    }
}
