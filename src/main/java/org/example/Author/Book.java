package org.example.Author;

import java.util.Objects;

enum Genre {
    FANTASY,
    SCIENCE_FICTION,
    ROMANCE,
    THRILLER,
    NON_FICTION,
    OTHER
}

public class Book {
    private String title;
    private double price;
    private int yearOfPublication;
    private String author;
    private String genre;

    public Book(String title, double price, int yearOfPublication, String author, String genre) {
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfPublication, author, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

}
