package com.step.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertTrue(library.addBook("A"));
    }

    @Test
    void removeBook() {
        library.addBook("A");
        library.addBook("B");
        assertTrue(library.removeBook("A"));
        assertFalse(library.removeBook("C"));
    }

    @Test
    void isRemoved() {
        library.addBook("A");
        library.addBook("B");

        library.removeBook("A");

        assertFalse(library.isRemoved("B"));
        assertTrue(library.isRemoved("A"));
    }

    @Test
    void giveBook() {
        Reader reader = new Reader("Chadnan");
        library.addBook("A");
        assertTrue(library.lendBook("A", reader));
    }

    @Test
    void takeBook() {
        Reader reader = new Reader("Chadnan");
        library.addBook("A");
        library.addBook("B");

        library.lendBook("A",reader);
        assertTrue(library.takeBook(reader, "A"));
    }

    @Test
    void doesBookExists() {
        library.addBook("A");
        library.addBook("B");

        assertTrue(library.doesBookExists("A"));
        assertFalse(library.doesBookExists("C"));
    }

    @Test
    void whoHasBorrowed() {
    }
}