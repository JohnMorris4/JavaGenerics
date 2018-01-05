package com.morrisje;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        items.add(7);
        items.add(8);

        printDoubled(items);
        }
        private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n ) {
            System.out.println( i*2);
        }
        }
}
