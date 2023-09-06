package comm;

import java.util.ArrayList;

public class Recursion_Linear_Search {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5,5,4,4,5,4};
        int target = 4;
        System.out.println(Linear_Search_1(arr,target,0));
        System.out.println(Linear_Search_2(arr,target,0));

        Linear_Search_3(arr,target,0);
        System.out.println(l);

//        ArrayList<Integer> l1 = new ArrayList<>();
//        Linear_Search_4(arr,target,0,l1);
//        System.out.println(l1);
        System.out.println(Linear_Search_4(arr,target,0,new ArrayList<>()));

        System.out.println(Linear_Search_5(arr,target,0));
    }

    //  #01     ==> Returning Boolean Value
    static boolean Linear_Search(int [] arr,int targrt, int index){
        if (index == arr.length){
            return false;
        }
        if (arr[index] == targrt){
            return true;
        }
        return Linear_Search(arr, targrt,index+1);
    }

    //  #02     ==> Returning Boolean Value
    static boolean Linear_Search_1(int [] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index]==target || Linear_Search_1(arr,target,index+1);
    }

    //  #03     ==> Returning Index Value
    static int Linear_Search_2(int [] arr,int targrt, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == targrt){
            return index;
        }
        return Linear_Search_2(arr, targrt,index+1);
    }

    //  #04     ==> Adding all possible indexes of target element in ArrayList  (Creating global variable of ArrayList outside the method and "nothing in the return")
    static ArrayList<Integer> l = new ArrayList<>();
    static void Linear_Search_3(int [] arr,int targrt, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == targrt){
            l.add(index);
        }
        Linear_Search_3(arr, targrt,index+1);
    }

    //  #05     ==> Adding all possible indexes of target element in ArrayList  (Passing ArrayList as Argument in the method and "return ArrayList" )
    static ArrayList<Integer> Linear_Search_4(int [] arr, int targrt, int index, ArrayList<Integer> l1){
        if (index == arr.length){
            return l1;
        }
        if (arr[index] == targrt){
            l1.add(index);
        }
        return Linear_Search_4(arr, targrt,index+1, l1);
    }

    static ArrayList<Integer> Linear_Search_5(int [] arr, int targrt, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        //  this will contain ans for that function call only
        if (arr[index] == targrt){
            list.add(index);
        }
        list.addAll(Linear_Search_5(arr,targrt,index+1));

        //  You can add your list int previously created list (create at every function call)
        //  or
        //  Create a new list and return as previously

        ArrayList<Integer> ReturnList = Linear_Search_5(arr,targrt,index+1);
        return list;
    }
}
