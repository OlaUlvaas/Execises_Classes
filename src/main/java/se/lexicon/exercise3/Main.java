package se.lexicon.exercise3;

import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        /**
         *      Make a program that demonstrates the relationship between Classes.
         *      a.Create a class “Author”and create a class “Book”.
         *      b.Create the appropriate relationship between “Author”and “Book”.
         *      i.One book can be written by only one author.
         *      ii.One author can write one or more books.
         *      c.In the main program create an array of authors where each author has at least one book.
         *      d.Add a method that prints all books that have been written by a specific author.
         *      e.Add another method to print the author of a specific book.
         *      -Covering relationship between Classes
         */

        Author weinz = new Author("Arne", "Weinz", "Swedish", "arne@home.se");
        Author matikainen = new Author("Lennart", "Matikainen", "Finnish", "mumin@suomi.fi");
        Author carlqvist = new Author("Ingrid", "Carlqvist", "Swedish", "blond@snygg.se");

        Book book1 = new Book("Perfekt Storm", weinz, 2015, 250, 300 );
        Book book2 = new Book("Fråm Sverige till Absurdistan", carlqvist,2016,219, 249 );
        Book book3 = new Book( "Landet som ingen ägde", weinz, 2017, 239, 290 );
        Book book4 = new Book( "Besatthetens inferno", matikainen, 2015, 279, 279 );
        Book book5 = new Book("Anstiftarens löfte", matikainen, 2018, 319, 329 );


        BookList info = new BookList();
        info.addBook(book1);
        info.addBook(book2);
        info.addBook(book3);
        info.addBook(book4);
        info.addBook(book5);


        System.out.println("find books using author object: ");
        System.out.println("--------------------------------");
        info.printBooksByAuthor(weinz);
        System.out.println("--------------------------------");
        System.out.println("\n");
        System.out.println("find author using book object");
        System.out.println("--------------------------------");
        info.printAuthorByBook(book5);
        System.out.println("--------------------------------");
        System.out.println("\n");




    }

}
