package comm;

public class Custom_Dynamic_Stack extends Custom_Stack{

    public Custom_Dynamic_Stack(){
        super();
    }

    public Custom_Dynamic_Stack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        //  this takes care of it being full
        if (this.isFull()){
            //  Double the array size
            int [] temp = new int[data.length * 2];

            //  Copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //  at this point we know that array is not full
        //  Insert item
        return super.push(item);
    }
}
