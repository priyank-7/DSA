package com;

public class Dynamic_Custom_Queue extends Custom_Circular_Queue{
    public Dynamic_Custom_Queue() {
        super();
    }

    @Override
    public boolean insert(int item) {

        //  this takes care of it being full
        if (this.isFull()){
            //  Double the array size
            int [] temp = new int[data.length * 2];

            //  Copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[front+i] % data.length;
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(item);
    }

    public Dynamic_Custom_Queue(int size) {
        super(size);
    }



}
