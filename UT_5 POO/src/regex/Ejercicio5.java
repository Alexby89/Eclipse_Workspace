package regex;

import java.util.Scanner;

public class Ejercicio5 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una frase: ");
		String texto = teclado.nextLine();
		String[] campos = texto.split(" ");
		System.out.println("El texto tiene " + campos.length + " palabras");
	}
}
