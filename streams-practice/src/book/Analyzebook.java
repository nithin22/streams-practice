package book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Analyzebook {

    public static void main(String[] args) {
        List<Book> booksData= Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 4.2),
                new Book("To Kill a Mockingbird", "Harper Lee", "Drama", 4.5),
                new Book("1984", "George Orwell", "Dystopian", 4.8),
                new Book("Pride and Prejudice", "Jane Austen", "Romance", 4.0),
                new Book("The Catcher in the Rye", "J.D. Salinger", "Coming of Age", 3.9),
                new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 4.7)
        );

//        Filter out all the books with a rating less than 4.0.
        filterBooksLessThan4Rating(booksData);
//        Create a list of the titles of the top 3 books based on their ratings.
        listOfTop3BooksbasedOnRating(booksData);
    }

    private static void listOfTop3BooksbasedOnRating(List<Book> booksData) {
        var ans=booksData.stream().sorted((b1,b2)->Double.compare(b2.getRating(),b1.getRating())).limit(3).map(Book::getTitle).collect(Collectors.toList());

        System.out.println("Top Three Books"+ans);
    }


    private static void filterBooksLessThan4Rating(List<Book> booksData) {
        var ans=booksData.stream().filter(s->s.getRating()<4).map(Book::getTitle).collect(Collectors.toList());
        System.out.println(ans);
    }
}
