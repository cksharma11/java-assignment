package com.step.library;

import java.util.Scanner;

public class Librarian {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int selectedOption = askOption();
        while (selectedOption != 4){
            switch (selectedOption){
                case 1:
                    System.out.println("Enter Reader Name  :");
                    String readerName = scanner.nextLine();
                    if(library.addReader(new Reader(readerName))){
                        System.out.println("Reader Added.");
                        break;
                    }
                    System.out.println("Something went wrong. ");
                    break;

                case 2:
                    System.out.println("Enter Reader Name  :");
                    String bookName = scanner.nextLine();
                    if(library.addBook(new Book(bookName))){
                        System.out.println("Book Added.");
                        break;
                    }
                    System.out.println("Something went wrong. ");
                    break;
                case 3:
                    System.out.println("Enter Reader Name  :");
                    String bookToRemove = scanner.nextLine();
                    if(library.removeBook(new Book(bookToRemove))){
                        System.out.println("Book Removed.");
                        break;
                    }
                    System.out.println("Something went wrong. ");
                    break;
                default:
                    System.out.println("Please choose a valid option.");
                    break;
            }
            selectedOption = askOption();
        }
    }

    public static int askOption(){
        System.out.println("1 . Add Reader ");
        System.out.println("2 . Add Book ");
        System.out.println("3 . Remove Book");
        System.out.println("4 . Exit");
        System.out.println("Enter your choice : ");
        Scanner scanner = new Scanner(System.in);
        int selectedOption = scanner.nextInt();
        return selectedOption;
    }
}
