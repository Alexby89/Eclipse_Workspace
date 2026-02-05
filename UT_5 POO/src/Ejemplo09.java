import java.util.Scanner;

public class Ejemplo09 {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		char[] letras = frase.toCharArray();
		
		for(int i = 0; i < letras.length; i++) {
			System.out.print(letras[i] + ' ');
		}
	}
}