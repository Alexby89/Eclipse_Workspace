package regex;
import java.util.Scanner;
public class Ejercicio6{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Matricula actual o antigua: ");
		String opcion = teclado.nextLine().trim();
		
		if(opcion.equalsIgnoreCase("actual")) {
			System.out.print("Introduce la matricula actual: ");
			String actual = teclado.nextLine();
			String regex = "[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}";
			
		
			if(actual.matches(regex)) {
				System.out.println("La matricula es valida");
			} else {
				System.out.println("El matricula no es valida");
			}
			
		} else if(opcion.equalsIgnoreCase("antigua")) {
			System.out.print("Introduce la matricula antigua: ");
			String antigua = teclado.nextLine();
			String regex = "(C|VI|AB|A|AL|O|AV|BA|B|CC|CA|S|CS|CE|CR|CO|CU|GI|GR|GU|SS|H|HU|IB|J|LO|GC|LE|L|LU|M|MA|ML|MU|NA|OU|PO|SA|TF|SG|SE|SO|T|TE|TO|V|VA|BI|ZA|Z)[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{1,2}";
			
		
			if(antigua.matches(regex)) {
				System.out.println("La matricula es valida");
			} else {
				System.out.println("La matricula no es valida");
			}
		}
		System.out.println("\nFin de programa");
	}
}