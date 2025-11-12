package models;

import java.time.LocalDate;

public class Book extends LibraryMaterial{
    public Book(String title, String author, LocalDate publicationDate, String isbn) {
        super(title, author, publicationDate, isbn);
    }

    @Override
    public String toString() {
        return "Book " + getTitle() + super.toString();
    }
}
