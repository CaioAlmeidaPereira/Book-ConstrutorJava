package com.mycompany.book;

public class Book {

    private String title;
    private String author;
    private int pages;

    // Construtor padrão
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.pages = 0;
    }

    // Construtor sobrecarregado
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Getter para title
    public String getTitle() {
        return this.title;
    }

    // Getter para author
    public String getAuthor() {
        return this.author;
    }

    // Getter para pages
    public int getPages() {
        return this.pages;
    }
}