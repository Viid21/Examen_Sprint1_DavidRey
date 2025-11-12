package models;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class LibraryMaterial {
    String title;
    String author;
    LocalDate publicationDate;
    String isbn;

    public LibraryMaterial(String title, String author, LocalDate publicationDate, String isbn) {
        this.author = author;
        this.publicationDate = publicationDate;
        this.title = title;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void addToCollection(Set<LibraryMaterial> collection){
        collection.add(this);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        LibraryMaterial that = (LibraryMaterial) object;
        return Objects.equals(isbn, that.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return " with author " + getAuthor() + " with publicationDate " + getPublicationDate() + " with isbn " + getIsbn();
    }
}
