import Exceptions.MaterialDoNotExists;
import models.Book;
import models.Encyclopedia;
import models.LibraryMaterial;
import models.Magazine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.LibraryManager;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LibraryManagerTest {
    Set<LibraryMaterial> materialsCollection;
    LibraryManager manager;

    @BeforeEach
    void init() {
        materialsCollection = new HashSet<>(Arrays.asList(
                new Book("Cien años de soledad", "Gabriel García Márquez",
                        LocalDate.parse("1967-11-19"), "978-84-376-494-7"),
                new Magazine("National Geographic España", "Varios autores",
                        LocalDate.parse("2025-11-01"), "977-1577-21000-7", 276),
                new Encyclopedia("Enciclopedia Universal Ilustrada Europeo-Americana", "Espasa-Calpe",
                        LocalDate.parse("1908-03-23"), "978-84-239-0001-1", 1)
        ));
        manager = new LibraryManager(materialsCollection);
    }

    @Test
    void givenThreeMaterials_whenAddedToCollection_thenCollectionSizeIncrements() {
        assertEquals(3, materialsCollection.size());
    }

    @Test
    void givenTwoMaterialsWithSameIsbn_whenAddedToCollection_thenCollectionSizeDoNotIncrement() {
        Book book = new Book("Cien años de soledad", "Gabriel García Márquez",
                LocalDate.parse("1967-11-19"), "978-84-376-494-7");
        book.addToCollection(materialsCollection);
        assertEquals(3, materialsCollection.size());
    }

    @Test
    void givenMaterialName_whenFindByName_thenFindMaterial() {
        assertEquals(new Book("Cien años de soledad", "Gabriel García Márquez",
                        LocalDate.parse("1967-11-19"), "978-84-376-494-7"),
                manager.findByName("Cien años de soledad"));
    }

    @Test
    void givenNonExistingMaterialName_whenTryFindByName_thenThrowsException() {
        assertThrows(MaterialDoNotExists.class, () -> manager.findByName("El señor de los anillos"));
    }

    @Test
    void givenPublicationDate_whenShowAllBooksByPublicationDate_thenShowCorrectMaterial() {
        String output = manager.showAllMaterialByPublicationDate(LocalDate.parse("1966-11-19"));
        assertEquals("National Geographic España 2025-11-01, Cien años de soledad 1967-11-19", output);
    }

    @Test
    void givenMagazine_whenUsingToString_thenShowCorrectData() {
        assertEquals("Magazine National Geographic España with author Varios autores with publicationDate" +
                        " 2025-11-01 with isbn 977-1577-21000-7 with release 276",
                manager.findByName("National Geographic España").toString());
    }
}
