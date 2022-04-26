package com.lexxkit;

public class Library {
    private final Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                System.out.println(newBook + " was added to the library.");
                return;
            }
        }
        System.out.println("The Library is full.");
    }

    public void printBooks() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                stringBuilder.append("\"" + books[i].getAuthor() + ": " + books[i].getName() + ": " + books[i].getYearPublished() + "\"\n");
            }
        }
        if (stringBuilder.length() > 0) {
            System.out.println("The Library contains:");
            System.out.println(stringBuilder.toString().trim());
        } else {
            System.out.println("The Library is empty!");
        }
    }
}
