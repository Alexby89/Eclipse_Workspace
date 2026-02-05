package Tarea_Login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SesionTest {
	private Sesion u1 = new Sesion("dmunuera", "123456");
	private Sesion u2 = new Sesion("alejandro", "holabuenas");
	private Sesion u3 = new Sesion("pepe", "654321");
	private Sesion u4 = new Sesion("jazmin", "hastanunca");
	
	
	@Test
	void test1() {
		assertTrue(u1.login("dmunuera", "123456"));
	}
	
	@Test
	void test2() {
		assertFalse(u2.login("alejandro", "holabuenas"));
	}
	
	@Test
	void test3() {
		assertTrue(u3.login("pepe", "654321"));
	}
	
	@Test
	void test4() {
		assertFalse(u4.login("jazmin", "hastanunca"));
	}
}
