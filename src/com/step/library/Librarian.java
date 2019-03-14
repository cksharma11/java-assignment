package com.step.library;

public class Librarian {
    public static void main(String[] args) {
        Reader reader = new Reader("Chandan");
        Library library = new Library();

        Book cars_of_future = new Book("Cars of future");
        Book alien_in_world = new Book("Alien in world");
        Book boxers = new Book("Boxers");
        Book don_number_one = new Book("Don number one");
        Book elephant_my_friend = new Book("Elephant my friend");
        Book fog_in_delhi = new Book("Fog in delhi");
        Book gully_boy = new Book("Gully boy");

        library.addBook(cars_of_future);
        library.addBook(alien_in_world);
        library.addBook(boxers);
        library.addBook(don_number_one);
        library.addBook(elephant_my_friend);
        library.addBook(fog_in_delhi);
        library.addBook(gully_boy);

        library.removeBook(cars_of_future);

        System.out.println(library.isRemoved("Alien in world"));
        System.out.println(library.isRemoved("Cars of future"));

        library.addReader(reader);
        library.lendBook(alien_in_world, reader);
        library.lendBook(boxers, reader);

        System.out.println(reader.hasAlreadyBorrowed("Alien in world"));
        System.out.println(reader.hasAlreadyBorrowed("Cars of future"));
        System.out.println(library.whoHasBorrowed("Alien in world"));

        library.takeBook(reader, boxers);

        System.out.println(library.doesBookExists("New Book"));
        System.out.println(library.doesBookExists("Alien in world"));
        System.out.println(library.doesBookExists("Gully boy"));

        System.out.println(library.getBooksOfReader(reader));
    }
}
