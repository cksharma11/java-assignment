package com.step.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void addReader() {
        Reader reader = new Reader("Chandan");
        assertTrue(library.addReader(reader));
    }

    @Test
    void addBook() {
        Book a = new Book("A");
        assertTrue(library.addBook(a));
    }

    @Test
    void removeBook() {
        Book a = new Book("A");
        Book b = new Book("B");
        Book c = new Book("C");
        library.addBook(a);
        library.addBook(b);
        assertTrue(library.removeBook(a));
        assertFalse(library.removeBook(c));
    }

    @Test
    void isRemoved() {
        Book b = new Book("B");
        Book a = new Book("A");
        library.addBook(a);
        library.addBook(b);
        library.removeBook(a);

        assertFalse(library.isRemoved("B"));
        assertTrue(library.isRemoved("A"));
    }

    @Test
    void lendBook() {
        Reader reader = new Reader("Chadnan");
        library.addReader(reader);
        Book a = new Book("A");
        Book b = new Book("B");
        library.addBook(a);
        assertFalse(library.lendBook(b, reader));
        assertTrue(library.lendBook(a, reader));
    }

    @Test
    void takeBook() {
        Reader reader = new Reader("Chadnan");
        library.addReader(reader);
        Book a = new Book("A");
        Book b = new Book("B");
        library.addBook(a);
        library.addBook(b);
        library.lendBook(a, reader);
        assertTrue(library.takeBook(reader, a));
    }

    @Test
    void doesBookExists() {
        Book a = new Book("A");
        Book b = new Book("B");
        library.addBook(a);
        library.addBook(b);

        assertTrue(library.doesBookExists("A"));
        assertFalse(library.doesBookExists("C"));
    }

    @Test
    void whoHasBorrowed() {
        Reader reader = new Reader("Chandan");
        library.addReader(reader);
        Book a = new Book("A");
        Book b = new Book("B");
        library.addBook(a);
        library.addBook(b);

        library.lendBook(a, reader);
        assertEquals("Chandan", library.whoHasBorrowed("A"));
    }

    @Test
    void getBooksOfReader() {
        Reader reader = new Reader("Chandan");
        library.addReader(reader);
        Book a = new Book("A");
        Book b = new Book("B");
        library.addBook(a);
        library.addBook(b);

        library.lendBook(a, reader);
        library.lendBook(b, reader);
        Set<String> userBooks = new HashSet<>();
        userBooks.add("A");
        userBooks.add("B");
        assertEquals(userBooks, library.getBooksOfReader(reader));
    }
}