package com.lexxkit;

public class Book {
    private String name;
    private Author author;
    private int yearPublished;

    public Book(String name, Author author, int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", yearPublished=" + yearPublished +
                '}';
    }
}
