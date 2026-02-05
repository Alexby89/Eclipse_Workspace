package regex;

import java.util.Scanner;

public class Ejercicio4 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una fecha: ");
		String mascara = teclado.nextLine().trim();
		String regex = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19|20)[0-9]{2}";

		if (mascara.matches(regex)) {
			System.out.println("La fecha es valida");
		} else {
			System.out.println("La fecha no es valida");
		}
		System.out.println("\nFin de programa");
	}
}