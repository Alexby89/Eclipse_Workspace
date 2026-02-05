package estatica;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // Import the ArrayList class

public class Ejemplo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumnos> lista = obtenerAlumnos();
		for(int i= 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		File fichero = new File("./assets/Alumnos.csv");//se pasa la ruta del fichero                          

	    // try-with-resources: Scanner will be closed automatically
	    try  {
	    	Scanner lector = new Scanner(fichero);
	      while (lector.hasNextLine()) {
	        String linea = lector.nextLine(); // en cada linea se guarda la siguiente linea y la imprime por pantalla
	        System.out.println(linea);
	      }lector.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	     
	    }
	  }

	public static ArrayList<Alumnos> obtenerAlumnos(){
		ArrayList<Alumnos> listado = new ArrayList <Alumnos>();
		File fichero = new File("./assets/Alumnos.csv");//se pasa la ruta del fichero

	    // try-with-resources: Scanner will be closed automatically
	    try  {
	    	Scanner lector = new Scanner(fichero);
	      while (lector.hasNextLine()) {
	        String linea = lector.nextLine(); // en cada linea se guarda la siguiente linea y la imprime por pantalla
	        String[] campos = linea.split(";");	      
	        if(campos.length == 5) {
	        	int id = Integer.parseInt(campos[0]);
	        	Alumnos alu = new Alumnos(id, campos[1], campos[2], campos[3],campos[4]) ;
	        	listado.add(alu);
	        }
	      }lector.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	     
	    }
		return listado;
	}
}
