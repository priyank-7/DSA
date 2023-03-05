package com;

import java.util.ArrayList;

class MinStack {
    public ArrayList<Integer> list;
    public ArrayList<Integer> ml;
    public int min_Ind;
    public int top;

    public MinStack() {
        list = new ArrayList<>();
        ml = new ArrayList<>();
        top = -1;
        min_Ind = -1;
    }

    public void push(int val) {

       top = top + 1;
       if (top == 0){
           min_Ind = min_Ind + 1;
           ml.add(min_Ind);
       }
       else if (val < list.get(ml.get(min_Ind))){
           min_Ind = top;
           list.add(val);
           ml.add(top);
       }
       else {
           top = top + 1;
           list.add(val);
       }
    }

    public void pop() {

        System.out.println(ml);
        if(top == min_Ind){
            top = top - 1;
            min_Ind = min_Ind - 1;
            return;
        }
        top = top - 1;
    }

    public int top() {
        return list.get(top);
    }

    public int getIndInMain() {
        return list.get(ml.get(min_Ind));
    }
}
public class LeetCode_155 {
    public static void main(String[] args) {

        int n = 5;
        System.out.println(++n);
        n = 5;
        System.out.println(n++);
        MinStack m = new MinStack();
        m.push(-2);
        m.push(0);
        m.push(-3);
        System.out.println(m.getIndInMain()); // return -3
        m.pop();
        System.out.println(m.top());    // return 0
        System.out.println(m.getIndInMain());
        m.pop();
    }
}
