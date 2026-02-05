package regex;
import java.util.Scanner;
public class Ejercicio2{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("DNI o NIE: ");
		String opcion = teclado.nextLine().trim();
		
		if(opcion.equalsIgnoreCase("dni")) {
			System.out.print("Introduce tu dni: ");
			String dni = teclado.nextLine();
			String regex = "^([0-9]{8})[TRWAGMYFPDXBNJZSQVHLCKE]$";
			
		
			if(dni.matches(regex)) {
				System.out.println("El dni es valido");
			} else {
				System.out.println("El dni no es valido");
			}
			
		} else if(opcion.equalsIgnoreCase("nie")) {
			System.out.print("Introduce tu NIE: ");
			String nie = teclado.nextLine();
			String regex = "^[X-Zx-z]([0-9]{7})[TRWAGMYFPDXBNJZSQVHLCKE]$";
			
		
			if(nie.matches(regex)) {
				System.out.println("El nie es valido");
			} else {
				System.out.println("El nie no es valido");
			}
		}
		System.out.println("\nFin de programa");
	}
}