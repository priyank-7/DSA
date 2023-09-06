package comm;

                    //  How to compare two objects

import java.util.Arrays;

class Students implements Comparable<Students>{
    int rollNo;
    float marks;

    public Students(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " " + rollNo;
    }



    @Override
    public int compareTo(Students o) {
        int diff = (int) (this.marks - o.marks);

        //  if diff == 0 ==> means both are zero
        //  If diff < 1 ==> means o is bigger else o is smaller

        return diff;
    }
}
public class Comparing {
    public static void main(String[] args) {
        Students priyank = new Students(12,89.76f);
        Students kunal = new Students(5,99.52f);
        Students kunal1 = new Students(2,95.52f);
        Students kunal2 = new Students(13,77.52f);
        Students kunal3 = new Students(9,96.52f);

        Students [] list = {priyank, kunal, kunal1, kunal2, kunal3};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, (o1, o2) -> {return (int) (o1.marks - o2.marks);});

            //  return -(int) (o1.marks - o2.marks);    <== for descending order
        System.out.println(Arrays.toString(list));


//        if (kunal.compareTo(priyank) > 0){
//            System.out.println(kunal.compareTo(priyank));
//            System.out.println("Priyank has more mor marks");
//        }
    }
}
