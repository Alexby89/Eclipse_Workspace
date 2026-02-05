import java.util.Scanner;

public class Ejemplo03 {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		//Ejemplo getChars
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		
		System.out.print("Introduce una palabra a buscar dentro de la frase anterior: ");
		String subcadena = teclado.nextLine().trim();
		
		int posicion = frase.toLowerCase().indexOf(subcadena);
		if(posicion < 0) {
			System.out.println("ERROR, no se encontro la palabra dentro de la frase");
		} else {
		System.out.println("La palabra que buscas esta en la posicion " + frase.toLowerCase().indexOf(subcadena));
		}
		System.out.println("\nFin de programa");
	}
}