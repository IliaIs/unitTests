package org.example;

public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {

        return pages > 500;
    }

    public int estimatePrice() {
        int price = (int) ((pages * 3) * Math.sqrt(author.rating));
        return Math.floor(price) < 250 ? 250 : price;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }
}
