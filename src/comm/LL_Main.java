package comm;

public class LL_Main {

    public static void main(String[] args) {

//        LL list = new LL();
//        // this insert function insert node values in front of the linked list
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(100, 3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

//        LL_Doubly list = new LL_Doubly();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(10);
//        list.insertLast(1000);
//        list.insert(1000,65);
//        list.display();
//        list.displayRev();

//        LLC l = new LLC();
//        l.insert(23);
//        l.insert(3);
//        l.insert(19);
//        l.insert(75);
//        l.delete(19);
//        l.display();

//        list.insertRec(88, 2);
//        list.display();

        LL second = new LL();
//        LL second = new LL();

//        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(5);
        second.insertLast(1);
//        second.insertLast(2);
        second.insertLast(14);
        second.insertLast(9);


//        LL ans = LL.merge(first,second);
//        ans.display();

        LL ans = LL.sortList(second);
        ans.display();

    }
}
