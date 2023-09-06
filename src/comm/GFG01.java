package comm;

public class GFG01 {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(-2);
        Node n3 = new Node(-3);
        Node n4 = new Node(4);
        Node n5 = new Node(-5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node n = sortList(n1);
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static Node sortList(Node head) {

        Node node = head;
        Node pre = head;
        Node temp = head;

        while(temp != null){

            if(temp.data < 0){
                pre.next = temp.next;
                temp.next = node;
                node = temp;
                temp = pre.next;
            }
            else{
                pre = temp;
                temp = temp.next;
            }
        }
        return node;
    }
}
