package comm;

public class Custom_Stack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Custom_Stack(){
        this(DEFAULT_SIZE);
    }

    public Custom_Stack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peak() throws Exception{

        if (isEmpty()){
            throw new Exception("Cannot peak from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
