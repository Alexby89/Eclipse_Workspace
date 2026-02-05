package Ficheros;
import java.util.Scanner;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class

public class Ejemplo03 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Introduce una frase para introducir en el texto: ");
		String frase = teclado.nextLine().trim();

		try {
			FileWriter myWriter = new FileWriter("./assets/texto.txt", true);
			myWriter.write("\n" + frase);
			myWriter.close();
			System.out.println("Esta vivo, y funciona");
		} catch (IOException e) {
			System.out.println("Que ha pasado??");
			e.printStackTrace();
		}

	}
}
