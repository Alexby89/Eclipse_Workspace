import java.util.Scanner;

public class Ejemplo10 {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		String[] partes = frase.split(" ", 3);
		
		for(int i = 0; i < partes.length; i++) {
			System.out.println((i+1) + ": " + partes[i]);
		}
	}
}