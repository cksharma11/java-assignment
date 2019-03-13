package com.step.sets;

import java.util.HashSet;
import java.util.Set;

public class SetOperations<T> {
    public static<T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> result = set1;
        result.addAll(set2);
        return result;
    }

    public static<T> Set<T> intersection(Set<T> set1, Set<T> set2){
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public static<T> Set<T> difference(Set<T> set1, Set<T> set2){
        Set<T> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }
}
