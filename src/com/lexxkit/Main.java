package com.lexxkit;

public class Main {

    public static void main(String[] args) {

        Author rowling = new Author("Joanne", "K.Rowling");
        Author herbert = new Author("Frank", "Herbert");
        Author rowling2 = new Author("Joanne", "Rowling");

        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", rowling, 1996);
        Book dune = new Book("Dune", herbert, 1965);
        Book harryPotter2 = new Book("Harry Poter Pt.2", rowling, 1997);

        Library library = new Library(2);
        library.printAllBooks();

        library.addBook(harryPotter);
        library.addBook(dune);
        library.printAllBooks();

        library.addBook(harryPotter);


        library.printBookByTitle("Dune");
        library.printBookByTitle("Death on the Nile");

        library.changeBookYearPublished("Harry Potter and the Philosopher's Stone", 1997);
        library.printBookByTitle("Harry Potter and the Philosopher's Stone");

        library.changeBookYearPublished("Death on the Nile", 1937);

        if (harryPotter.equals(harryPotter2)) {
            System.out.println("Books are equal.");
        } else {
            System.out.println("Books are different.");
        }

        if (rowling.equals(rowling2)) {
            System.out.println("This is the same author.");
        } else {
            System.out.println("Authors are different.");

        }
    }
}
