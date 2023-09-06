package comm;

import java.util.Arrays;

public class Custom_ArrayList {

    private int [] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;   //  Also working as index value

    public Custom_ArrayList() {
        data = new int[DEFAULT_SIZE];
    }


    public void add (int num) {
        if (this.isFull()) {
            resize();
        }

        data[size++] = num;
    }
    private void resize() {
        int [] temp = new int [data.length * 2];

        //  Copy the current item int this array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    @Override
    public String toString() {
        return "Custom_ArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public int size (){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }



    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("sjh");
//        list.add(1);
//        list.add('a');
        Custom_ArrayList list = new Custom_ArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for (int i = 0; i < 14; i++) {
            list.add(i);
        }
        list.set(2,5);

        System.out.println(list);
    }
}
