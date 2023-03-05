package com;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lamda_Expressinn {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }

        arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        arr.forEach(fun);
    }

    static int sum(int a, int b){
        return a+b;
    }
}
