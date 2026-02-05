import java.util.Scanner;

public class Ejemplo11 {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		
		System.out.print("Indica la palabra que quieres cambiar: ");
		String palabra = teclado.nextLine();
		
		System.out.print("Introduce la nueva palabra: ");
		String nuevo = teclado.nextLine();
		
		System.out.println(frase);
		System.out.println(palabra);
		System.out.println(nuevo);
		
		System.out.println(frase.replaceAll(palabra, nuevo));
	}
}