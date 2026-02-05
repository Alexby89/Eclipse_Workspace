package Estudiante;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstudianteTest {

	private Estudiante e1;
	private Estudiante e2;
	private Estudiante e3;

	@BeforeEach
	public void crearEstudiantes() {
		e1 = new Estudiante("Alejandro", 23, 7.9);
		e2 = new Estudiante("Jazmin", 19, 9.6);
		e3 = new Estudiante("Antonio", 20, 4.5);
	}

	@Test
	void testGetNombre() {
		assertEquals("Alejandro", e1.getNombre());
		assertNotNull(e1);
		assertEquals("Jazmin", e2.getNombre());
		assertNotNull(e2);
		assertEquals("Antonio", e3.getNombre());
		assertNotNull(e3);
	}

	@Test
	void testGetEdad() {
		assertEquals(23, e1.getEdad());
		assertNotNull(e1);
		assertEquals(19, e2.getEdad());
		assertNotNull(e2);
		assertEquals(20, e3.getEdad());
		assertNotNull(e3);
	}

	@Test
	void testGetNota() {
		assertEquals(7.9, e1.getNota());
		assertNotNull(e1);
		assertEquals(9.6, e2.getNota());
		assertNotNull(e2);
		assertEquals(4.5, e3.getNota());
		assertNotNull(e3);
	}

	@Test
	void testObtenerEstadoAcademico() {
		assertEquals("Notable", e1.obtenerEstadoAcademico());
		assertNotNull(e1);
		assertEquals("Sobresaliente", e2.obtenerEstadoAcademico());
		assertNotNull(e2);
		assertEquals("Suspenso", e3.obtenerEstadoAcademico());
		assertNotNull(e3);
	}
}
