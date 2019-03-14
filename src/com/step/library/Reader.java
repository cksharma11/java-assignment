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

    public void borrowBook(String book){
        this.books.add(book);
    }

    public boolean hasAlreadyBorrowed(String book){
        return this.books.contains(book);
    }

    public void returnBook(String book){
        this.books.remove(book);
    }

    public String getName() {
        return this.name;
    }

    public Set<String> getBooks() {
        return books;
    }
}
