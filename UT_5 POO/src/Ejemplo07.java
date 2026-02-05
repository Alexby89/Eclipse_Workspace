import java.util.Scanner;

public class Ejemplo07 {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		char[] letras = {'A', 'B', 'C', ' ', 'D', 'E', 'F'};
		String texto = new String(letras);

		System.out.println(texto);
	}
}