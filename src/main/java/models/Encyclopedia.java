package models;

import java.time.LocalDate;

public class Encyclopedia extends Book {
    int volume;

    public Encyclopedia(String title, String author, LocalDate publicationDate, int volume) {
        super(title, author, publicationDate);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + " with volume " + getVolume();
    }
}
