package se.lexicon.exercise3;

import java.util.Arrays;

public class BookList {
    private Book[] books = new Book[0];

    public void addBook(Book book) {
        Book[] newBookArray = Arrays.copyOf(books, books.length + 1);
        newBookArray[newBookArray.length - 1] = book;
        books = newBookArray;
    }

    public void printAuthorByBook(Book book) {
        System.out.println("BookName: " + book.getTitle() + "\tAuthor: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
    }

    public void printBooksByAuthor(Author author) {
        Book[] result = new Book[0];
        for (Book book : books) {
            if (book.getAuthor().getFirstName().equalsIgnoreCase(author.getFirstName())) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length -1] = book;
            }
        }

        for (Book book : result){
            System.out.println("BookName: " + book.getTitle() + "\t\tAuthor: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());

        }

    }


}

