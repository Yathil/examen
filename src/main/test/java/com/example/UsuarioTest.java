import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testSancionar() {
        Usuario usuario = new Usuario();
        usuario.sancionar();
        assertTrue(usuario.isSancionado());
    }

    @Test
    void testQuitarSancion() {
        Usuario usuario = new Usuario();
        usuario.sancionar();
        usuario.quitarSancion();
        assertFalse(usuario.isSancionado());
    }
}