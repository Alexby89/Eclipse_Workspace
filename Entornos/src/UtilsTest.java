import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilsTest {

    @Test
    void testEsTriangulo() {
        assertTrue(Utils.esTriangulo(3, 4, 5));
        assertTrue(Utils.esTriangulo(5, 5, 5));

        assertFalse(Utils.esTriangulo(1, 2, 3));
        assertFalse(Utils.esTriangulo(-1, 4, 5));
        assertFalse(Utils.esTriangulo(0, 3, 3));
    }

    @Test
    void testTipoTriangulo() {
        assertNotNull(Utils.tipoTriangulo());
    }

    @Test
    void testMasFrecuenteInt() {
        int[] datos = {1, 2, 2, 3, 2, 4};
        assertEquals(2, Utils.masFrecuenteInt(datos));
    }

    @Test
    void testBuscarInt() {
        int[] numeros = {3,1,7,4,9,5,7,3,87};
        int num = 5;
        int resultado = Utils.buscarInt(numeros, num);
        assertEquals(5, resultado);
    }
}
