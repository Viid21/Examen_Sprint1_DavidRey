package models;

import java.time.LocalDate;
import java.util.List;

public class Book {
    String title;
    String author;
    LocalDate publicationDate;

    public Book(String title, String author, LocalDate publicationDate) {
        this.author = author;
        this.publicationDate = publicationDate;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void addToCollection(List<Book> collection){
        collection.add(this);
    }

    @Override
    public String toString() {
        return "Book " + getTitle() +" with author " + getAuthor() + " with publicationDate " + getPublicationDate();
    }
}
