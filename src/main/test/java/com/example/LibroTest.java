import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void testAltaLibro() {
        // Create a new Libro instance
        Libro libro = new Libro("1", "Test Title", "1234567890", "Test Author", "Novela", "2022-01-01");

        // Test that the attributes are set correctly
        assertEquals("1", libro.getId_Libro());
        assertEquals("Test Title", libro.getTitulo());
        assertEquals("1234567890", libro.getIsbn());
        assertEquals("Test Author", libro.getAutor());
        assertEquals("Novela", libro.getTematica());
        assertEquals("2022-01-01", libro.getFechaEdicion());
    }

    @Test
    void testAltaLibroUniqueAttributes() {
        // Create a new Libro instance
        Libro libro1 = new Libro("1", "Test Title", "1234567890", "Test Author", "Novela", "2022-01-01");
        Libro libro2 = new Libro("1", "Test Title 2", "1234567891", "Test Author 2", "Ensayo", "2022-01-02");

        // Test that the unique attributes are not repeated
        assertNotEquals(libro1.getId_Libro(), libro2.getId_Libro());
        assertNotEquals(libro1.getIsbn(), libro2.getIsbn());
    }
}