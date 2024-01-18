package org.example;

public class Main {
    public static void main(String[] args) {
        Book book =
                new Book("Song of ice and fire", 2005,
                        new Author("George", "Martin", 10), 1500);

        System.out.println(book.isBig());
        System.out.println(book.matches("ice"));
        System.out.println(book.matches("Mar"));
        System.out.println(book.matches("Geo"));
        System.out.println(book.matches("geo"));
        System.out.println(book.estimatePrice());
    }
}