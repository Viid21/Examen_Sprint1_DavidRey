package models;

import java.time.LocalDate;

public class Magazine extends LibraryMaterial {
    int release;

    public Magazine(String title, String author, LocalDate publicationDate, String isbn, int release) {
        super(title, author, publicationDate, isbn);
        this.release = release;
    }

    public int getRelease() {
        return release;
    }

    @Override
    public String toString() {
        return "Magazine " + super.getTitle() + super.toString() + " with release " + getRelease();
    }
}
