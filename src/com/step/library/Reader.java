package com.step.library;

import java.util.HashSet;
import java.util.Set;

public class Reader {
    private String name;
    private Set<String> books;

    public Reader(String name) {
        this.name = name;
        this.books = new HashSet<>();
    }

    public boolean borrowBook(String book){
        return this.books.add(book);
    }

    public boolean hasAlreadyBorrowed(String book){
        return this.books.contains(book);
    }

    public boolean returnBook(String book){
        return this.books.remove(book);
    }

    public String getName() {
        return this.name;
    }
}
