package com.step.library;

import java.util.*;

public class Library {
    private Map<String,Book> books;
    private List<String> removedBooks;
    private Set<Reader> readers;
    private Map<String, String> records;
    private Map<String, Set<String>> booksOwnedByReaders;

    public Library() {
        this.books = new HashMap<>();
        this.removedBooks = new ArrayList<>();
        this.readers = new HashSet<>();
        this.records = new HashMap<>();
        this.booksOwnedByReaders = new HashMap<>();
    }

    public boolean addReader(Reader reader) {
        if(this.readers.contains(reader)) return false;
        Set<String> books = new HashSet<>();
        this.booksOwnedByReaders.put(reader.getName(),books);
        return this.readers.add(reader);
    }

    public boolean addBook(Book book) {
        if(this.books.containsKey(book.getName())) return false;
        this.books.put(book.getName(),book);
        return true;
    }

    public boolean removeBook(Book book) {
        if(!this.books.containsKey(book.getName())) return false;
        this.removedBooks.add(book.getName());
        this.books.remove(book.getName());
        return true;
    }

    public boolean isRemoved(String bookName) {
        return this.removedBooks.contains(bookName);
    }

    public boolean lendBook(Book book, Reader reader) {
        if(!this.books.containsKey(book.getName()) && !reader.hasAlreadyBorrowed(book.getName())) return false;
        this.booksOwnedByReaders.get(reader.getName()).add(book.getName());
        records.put(book.getName(), reader.getName());
        reader.borrowBook(book);
        books.remove(book.getName());
        return true;
    }

    public boolean takeBook(Reader reader,Book book){
        reader.returnBook(book.getName());
        this.booksOwnedByReaders.get(reader.getName()).remove(book.getName());
        this.books.put(book.getName(), book);
        return true;
    }

    public boolean doesBookExists(String bookName) {
        return this.books.containsKey(bookName);
    }

    public String whoHasBorrowed(String bookName) {
        return this.records.get(bookName);
    }

    public Set<String> getBooksOfReader(Reader reader){
        return this.booksOwnedByReaders.get(reader.getName());
    }
}
