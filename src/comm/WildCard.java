package comm;


import java.util.Arrays;
import java.util.List;

//  here T should either be number or it's subclasses

class WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;   //  Also working as index value

    public WildCardExample() {
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        //  Do something

        //  Here you can pass Number type
    }

    public void add(T num) {
        if (this.isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //  Copy the current item int this array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public String toString() {
        return "Custom_ArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }
}


public class WildCard {
    public static void main(String[] args) {
        WildCardExample<Integer> list = new WildCardExample<>();
    }
}
