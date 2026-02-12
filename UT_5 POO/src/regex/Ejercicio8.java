package regex;

import java.util.Scanner;

public class Ejercicio8 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una numero realº: ");
		String binario = teclado.nextLine().trim();
		String regex = "([01]|1[01]+)";

		if (binario.matches(regex)) {
			System.out.println("El binario es valido");
		} else {
			System.out.println("El binario no es valido");
		}
		System.out.println("\nFin de programa");
	}
}