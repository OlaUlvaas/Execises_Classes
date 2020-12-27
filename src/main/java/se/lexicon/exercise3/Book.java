package se.lexicon.exercise3;

public class Book {
    private static int bookId = 0;
    private String title;
    private Author author;
    private int year;
    private double price;
    private int sides;

    public Book(){
        bookId = getBookId();
        bookId++;
    }

    public Book(String title, Author author, int year, double price,int sides) {
        bookId = getBookId();
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
       this.sides = sides;
        bookId++;
    }

    public static int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
