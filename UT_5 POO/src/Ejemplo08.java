import java.util.Scanner;

public class Ejemplo08 {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		System.out.println("Frase: " + frase);
		System.out.println(frase.substring(frase.indexOf(" "), frase.lastIndexOf(" ")));
	}
}