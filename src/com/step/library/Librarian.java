package com.step.library;

public class Librarian {
    public static void main(String[] args) {
        Reader reader = new Reader("Chandan");
        Library library = new Library();
        library.addBook("Alien in world");
        library.addBook("Boxers");
        library.addBook("Cars of future");
        library.addBook("Don number one");
        library.addBook("Elephant my friend");
        library.addBook("Fog in delhi");
        library.addBook("Gully boy");

        library.removeBook("Cars of future");

        System.out.println(library.isRemoved("Alien in world"));
        System.out.println(library.isRemoved("Cars of future"));

        library.addReader(reader);
        library.lendBook("Alien in world", reader);
        library.lendBook("Boxers", reader);

        System.out.println(reader.hasAlreadyBorrowed("Alien in world"));
        System.out.println(reader.hasAlreadyBorrowed("Cars of future"));
        System.out.println(library.whoHasBorrowed("Alien in world"));

        library.takeBook(reader, "Boxers");

        System.out.println(library.doesBookExists("New Book"));
        System.out.println(library.doesBookExists("Alien in world"));
        System.out.println(library.doesBookExists("Gully boy"));

        System.out.println(library.getBooksOfReader(reader));
    }
}
