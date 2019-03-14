package com.step.library;

import java.util.HashSet;
import java.util.Set;

public class Reader {
    private String name;
    private Set<Book> books;

    public Reader(String name) {
        this.name = name;
        this.books = new HashSet<>();
    }

    public boolean borrowBook(Book book){
        if(!this.books.contains(book)) return false;
        return this.books.add(book);
    }

    public boolean hasAlreadyBorrowed(String book){
        return this.books.contains(book);
    }

    public boolean returnBook(String book){
        if(!this.books.contains(book)) return false;
        return this.books.remove(book);
    }

    public String getName() {
        return this.name;
    }
}
