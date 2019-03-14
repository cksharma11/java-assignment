package com.step.library;

import java.util.*;

public class Library {
    private List<String> books;
    private List<String> removedBooks;
    private Set<Reader> readers;
    private Map<String, String> records;

    public Library() {
        this.books = new ArrayList<>();
        this.removedBooks = new ArrayList<>();
        this.readers = new HashSet<>();
        this.records = new HashMap<>();
    }

    public boolean addReader(Reader reader) {
        return this.readers.add(reader);
    }

    public boolean addBook(String bookName) {
        return this.books.add(bookName);
    }

    public boolean removeBook(String bookName) {
        this.removedBooks.add(bookName);
        return this.books.remove(bookName);
    }

    public boolean isRemoved(String bookName) {
        return this.removedBooks.contains(bookName);
    }

    public boolean lendBook(String book, Reader reader) {
        reader.borrowBook(book);
        records.put(book, reader.getName());
        return books.remove(book);
    }

    public boolean takeBook(Reader reader,String bookName){
        reader.returnBook(bookName);
        return this.books.add(bookName);
    }

    public boolean doesBookExists(String bookName) {
        return this.books.contains(bookName);
    }

    public String whoHasBorrowed(String bookName) {
        return this.records.get(bookName);
    }
}
