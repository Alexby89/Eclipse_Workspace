import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	@BeforeEach
	void antes() {
		System.out.println("Antes de los test");
	}
	
	@Test
	void testSuma() {
		System.out.println("TEST Suma");
		Calculadora c = new Calculadora(4, 6);
		int resultado = c.suma();
		assertEquals(10, resultado);
	}

	@Test
	void testResta() {
		System.out.println("TEST Resta");
		Calculadora c = new Calculadora(4, 6);
		int resultado = c.resta();
		assertEquals(-2, resultado);
	}

	@Test
	void testMultiplicacion() {
		System.out.println("TEST Multiplicacion");
		Calculadora c = new Calculadora(4, 6);
		int resultado = c.multiplicacion();
		assertEquals(24, resultado);
	}

	@Test
	void testDivision() {
		System.out.println("TEST Division");
		Calculadora c = new Calculadora(12, 6);
		int resultado = c.division();
		assertEquals(2, resultado, "El resultado de la division no es el esperado");
	}

}
