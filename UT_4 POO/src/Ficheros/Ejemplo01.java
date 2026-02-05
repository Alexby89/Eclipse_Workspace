package Ficheros;
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class Ejemplo01 {
	public static void main(String[] args) {
		File fichero = new File("./assets/texto.txt");

	    try {
	    	Scanner Lector = new Scanner(fichero);
	    	while (Lector.hasNextLine()) {
	    		String linea = Lector.nextLine();
	    		System.out.println(linea);
	    	}
	    	Lector.close();
	    } catch (FileNotFoundException e) {
	    	System.out.println("Ha ocurrido un error!");
	    }
	}
}
