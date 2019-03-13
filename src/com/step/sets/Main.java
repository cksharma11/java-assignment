package com.step.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(4);

        System.out.println(SetOperations.union(set1,set2));
        System.out.println(SetOperations.intersection(set1,set2));
        System.out.println(SetOperations.difference(set1,set2));

    }
}
