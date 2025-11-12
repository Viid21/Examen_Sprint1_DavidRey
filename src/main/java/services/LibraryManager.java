package services;

import Exceptions.MaterialDoNotExists;
import models.Book;
import models.Encyclopedia;
import models.Magazine;

import java.time.LocalDate;
import java.util.List;

public class LibraryManager {
    List<Book> booksCollection;

    public LibraryManager(List<Book> booksCollection) {
        this.booksCollection = booksCollection;
    }

    public List<Book> getBooksCollection() {
        return booksCollection;
    }

    public Book findBook(String title) {
        for (Book book : getBooksCollection()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new MaterialDoNotExists("This material does not exists.");

        /*return getBooksCollection().stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElseThrow(new MaterialDoNotExists("This material does not exists."));*/

    }

    public String showAllBooksByPublicationDate(LocalDate date) {
        String output = "";
        for (Book book : getBooksCollection()) {
            if (book.getPublicationDate().isAfter(date)) {
                if (book instanceof Magazine) {
                    Magazine magazine = (Magazine) book;
                    output += magazine.toString();
                } else if (book instanceof Encyclopedia) {

                } else {
                    output += book.toString();
                }
            }
        }
    }
}
