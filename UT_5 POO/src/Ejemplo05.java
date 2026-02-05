import java.util.Scanner;

public class Ejemplo05 {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		
		System.out.print("Introduce una palabra a buscar dentro de la frase anterior: ");
		String subcadena = teclado.nextLine().trim();
		
		boolean valor = (frase.toLowerCase().contains(subcadena.toLowerCase()));
		if(valor == true) {
			System.out.println("La palabra " + subcadena +  " fue encontrada");
		} else {
			System.out.println("La palabra " + subcadena + " no fue encontrada");
		}
		System.out.println("\nFin de programa");
	}
}