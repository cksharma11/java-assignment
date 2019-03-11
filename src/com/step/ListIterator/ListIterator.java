package com.step.ListIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private final List list;
    private int currentIndex;

    public ListIterator(List list){
        this.list = list;
        this.currentIndex = 0;
    }

    public Object next(){
        if(this.hasNext()) {
            return this.list.get(currentIndex++);
        }
        throw  new NoSuchElementException();
    }

    public boolean hasNext(){
        return currentIndex < list.size();
    }
}
