package Bloque2;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c1 = new Cuenta("Alejandro", 0);
		System.out.println(c1);
		c1.ingresar(1000);
		System.out.println(c1);
		c1.retirar(2000);
		System.out.println(c1);
	}
}
