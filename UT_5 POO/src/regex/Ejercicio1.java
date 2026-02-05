package regex;
import java.util.Scanner;
public class Ejercicio1{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce un nombre de usuario: ");
		String username = teclado.nextLine();
		String regex = "^[A-Za-z][A-Za-z0-9_#$%?=+-]{2,19}";
		
	
		if(username.matches(regex)) {
			System.out.println("El usuario es valido");
		} else {
			System.out.println("El usuario no es valido");
		}
	}
}