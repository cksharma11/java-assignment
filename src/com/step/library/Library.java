package com.step.library;

import java.util.*;

public class Library {
    private List<String> books;
    private List<String> removedBooks;
    private Set<Reader> readers;
    private Map<String, String> records;
    private Map<String, Set<String>> booksOwnedByReaders;

    public Library() {
        this.books = new ArrayList<>();
        this.removedBooks = new ArrayList<>();
        this.readers = new HashSet<>();
        this.records = new HashMap<>();
        this.booksOwnedByReaders = new HashMap<>();
    }

    public boolean addReader(Reader reader) {
        Set<String> books = new HashSet<>();
        this.booksOwnedByReaders.put(reader.getName(),books);
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
        this.booksOwnedByReaders.get(reader.getName()).add(book);
        records.put(book, reader.getName());
        return books.remove(book);
    }

    public boolean takeBook(Reader reader,String bookName){
        reader.returnBook(bookName);
        this.booksOwnedByReaders.get(reader.getName()).remove(bookName);
        return this.books.add(bookName);
    }

    public boolean doesBookExists(String bookName) {
        return this.books.contains(bookName);
    }

    public String whoHasBorrowed(String bookName) {
        return this.records.get(bookName);
    }

    public Set<String> getBooksOfReader(Reader reader){
        return this.booksOwnedByReaders.get(reader.getName());
    }
}
