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

    public void printAllBooks() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                stringBuilder.append(books[i]);
                stringBuilder.append("\n");
            }
        }
        if (stringBuilder.length() > 0) {
            System.out.println("The Library contains:");
            System.out.println(stringBuilder.toString().trim());
        } else {
            System.out.println("The Library is empty!");
        }
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book != null && book.getName().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void printBookByTitle(String title) {
        Book book = findBookByTitle(title);
        if (book == null) {
            System.out.println("There is no book '" + title + "' in the library.");
            return;
        }
        System.out.println(
                book.getName() + " by " + book.getAuthor() + " was published in " + book.getYearPublished()
        );
    }

    public void changeBookYearPublished(String title, int year) {
        Book book = findBookByTitle(title);
        if (book == null) {
            System.out.println("There is no book '" + title + "' in the library.");
            return;
        }

        int oldYear = book.getYearPublished();
        book.setYearPublished(year);
        System.out.println(book.getName() + " by " + book.getAuthor()
                + " published year was changed from " + oldYear + " to " + book.getYearPublished());
    }
}
