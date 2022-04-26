package com.lexxkit;

public class Main {

    public static void main(String[] args) {

        Author rowling = new Author("Joanne", "K.Rowling");
        Author herbert = new Author("Frank", "Herbert");

        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", rowling, 1996);
        Book dune = new Book("Dune", herbert, 1965);

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

    }
}
