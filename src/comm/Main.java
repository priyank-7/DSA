package comm;

public class Main {
    public static void main(String[] args) throws Exception {
//        Custom_Stack stack  = new Custom_Dynamic_Stack(5);
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Custom_Queue q = new Custom_Queue(5);
//
//        q.insert(1);
//        q.insert(2);
//        q.insert(3);
//        q.insert(4);
//        q.insert(5);
//
//        q.display();
//
//        System.out.println(q.remove());
//
//        q.display();

        Custom_Circular_Queue q = new Custom_Circular_Queue(5);

        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);

        q.display();
        System.out.println();
        System.out.println(q.remove());
        q.display();
        System.out.println();
        q.insert(99);
        q.display();

    }
}
