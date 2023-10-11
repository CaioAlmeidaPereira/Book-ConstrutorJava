package com.mycompany.book;

public class MainBook {
    public static void main(String[] args) {
        // Criando objetos da classe Book
        Book defaultBook = new Book(); // Usará o construtor padrão
        Book customBook = new Book("1984", "George Orwell", 328); // Usará o construtor sobrecarregado

        // Exibindo informações dos livros
        System.out.println("Default Book:");
        System.out.println("Title: " + defaultBook.getTitle());
        System.out.println("Author: " + defaultBook.getAuthor());
        System.out.println("Pages: " + defaultBook.getPages());

        System.out.println("\nCustom Book:");
        System.out.println("Title: " + customBook.getTitle());
        System.out.println("Author: " + customBook.getAuthor());
        System.out.println("Pages: " + customBook.getPages());
    }
}