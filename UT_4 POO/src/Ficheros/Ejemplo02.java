package Ficheros;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class

public class Ejemplo02 {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("./assets/texto.txt", true);
			myWriter.write("\n Esto es una nueva linea");
			myWriter.close();
			System.out.println("Esta vivo, y funciona");
		} catch (IOException e) {
			System.out.println("Que ha pasado??");
			e.printStackTrace();
		}

	}
}
