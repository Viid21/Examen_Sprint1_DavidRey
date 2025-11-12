package models;

import java.time.LocalDate;

public class Encyclopedia extends LibraryMaterial {
    int volume;

    public Encyclopedia(String title, String author, LocalDate publicationDate, String isbn, int volume) {
        super(title, author, publicationDate, isbn);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Encyclopedia " + super.getTitle() + super.toString() + " with volume " + getVolume();
    }
}
