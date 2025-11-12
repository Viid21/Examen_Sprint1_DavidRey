package models;

import java.time.LocalDate;
import java.util.List;

public class Magazine extends Book {
    int release;

    public Magazine(String title, String author, LocalDate publicationDate, int release) {
        super(title, author, publicationDate);
        this.release = release;
    }

    public int getRelease() {
        return release;
    }

    @Override
    public String toString() {
        return super.toString() + " with release " + getRelease();
    }
}
