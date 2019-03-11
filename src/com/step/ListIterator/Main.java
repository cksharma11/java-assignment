package com.step.ListIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator listIterator = new ListIterator(list);

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println(listIterator.next());
    }
}
