import java.util.Scanner;

public class Ejemplo04 {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		
		System.out.print("Introduce una palabra a buscar dentro de la frase anterior: ");
		String subcadena = teclado.nextLine().trim();
		
		int posicion = frase.toLowerCase().lastIndexOf(subcadena);
		if(posicion < 0) {
			System.out.println("ERROR, no se encontro la palabra dentro de la frase");
		} else {
		System.out.println("La ultima ocurrencia de la palabra que buscas esta en la posicion " + frase.toLowerCase().lastIndexOf(subcadena));
		}
		System.out.println("\nFin de programa");
	}
}