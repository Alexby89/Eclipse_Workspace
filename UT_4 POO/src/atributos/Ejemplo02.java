package atributos;
import java.util.Scanner;
public class Ejemplo02 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Libro[] libros = crearLibros(3);
		
		mostrarLibros(libros);
		
	}
	public static Libro[] crearLibros(int cantidad) {
		Libro [] libros = new Libro[cantidad];
		for(int i = 0; i < libros.length; i++) {
			libros[i] = new Libro();
			System.out.println((i+1) + "º libro");
			
			System.out.print("Titulo: ");
			libros[i].Titulo = teclado.nextLine().trim();
			
			System.out.print("Paginas: ");
			libros[i].paginas = Integer.parseInt(teclado.nextLine().trim());
			
			System.out.print("Autor: ");
			libros[i].autor = teclado.nextLine().trim();
		}
	return libros;
	}
	
	public static void mostrarLibros(Libro[] libros) {
		System.out.println("\nLibros\n");
		
		for(int i = 0; i < libros.length; i++) {
			System.out.println((i+1) + "º libro");
			System.out.println(libros[i].Titulo + " (" + libros[i].paginas + " paginas)");
		}
	}
}