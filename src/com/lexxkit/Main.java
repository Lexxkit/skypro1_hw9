package com.lexxkit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Author rowling = new Author("Joanne", "K.Rowling");
        Author herbert = new Author("Frank", "Herbert");

        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", rowling, 1996);
        Book dune = new Book("Dune", herbert, 1965);

        System.out.println(harryPotter);

        harryPotter.setYearPublished(1997);

        System.out.println(harryPotter);

        System.out.println(dune);

        Book[] books = new Book[10];
        books[0] = harryPotter;
        books[1] = dune;

        System.out.println(Arrays.toString(books));
        addBook(books, harryPotter);
        System.out.println(Arrays.toString(books));
        printBooks(books);
    }

    public static void addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }
    }

    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("\"" + books[i].getAuthor() + ": " + books[i].getName() + ": " + books[i].getYearPublished() + "\"");
            }
        }
    }
}
