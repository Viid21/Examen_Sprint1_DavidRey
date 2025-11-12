package services;

import Exceptions.MaterialDoNotExists;
import models.LibraryMaterial;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class LibraryManager {
    Set<LibraryMaterial> materialCollection;

    public LibraryManager(Set<LibraryMaterial> materialCollection) {
        this.materialCollection = materialCollection;
    }

    public Set<LibraryMaterial> getMaterialCollection() {
        return materialCollection;
    }

    public LibraryMaterial findByName(String title) {
        return getMaterialCollection().stream()
                .filter(material -> material.getTitle().equals(title))
                .findFirst()
                .orElseThrow(() -> new MaterialDoNotExists("This material does not exists."));
    }

    public String showAllMaterialByPublicationDate(LocalDate date) {
        return getMaterialCollection().stream()
                .filter(material -> material.getPublicationDate().isAfter(date))
                .map(material -> material.getTitle() + " " + material.getPublicationDate())
                .collect(Collectors.joining(", "));
    }
}

