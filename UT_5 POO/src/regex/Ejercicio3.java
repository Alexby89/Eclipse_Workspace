package regex;

import java.util.Scanner;

public class Ejercicio3 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una direccion IPv4: ");
		String mascara = teclado.nextLine().trim();
		String regex = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";

		if (mascara.matches(regex)) {
			System.out.println("La IP es valido");
		} else {
			System.out.println("La IP no es valido");
		}
		System.out.println("\nFin de programa");
	}
}