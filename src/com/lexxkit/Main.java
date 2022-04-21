package com.lexxkit;

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
    }
}
