import org.junit.Test;

class BibliotecaTest {

    @Test
    void testAltaLibro() {
        Biblioteca biblioteca = new Biblioteca();
        // Test case: Unique attributes not repeated
        assertTrue(biblioteca.altaLibro("1", "Title1", "ISBN1"));
        // Test case: Unique attributes repeated
        assertFalse(biblioteca.altaLibro("1", "Title1", "ISBN1"));
    }

    @Test
    void testBajaLibro() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.altaLibro("1", "Title1", "ISBN1");
        // Test case: Book exists
        assertTrue(biblioteca.bajaLibro("1"));
        // Test case: Book does not exist
        assertFalse(biblioteca.bajaLibro("2"));
    }
}