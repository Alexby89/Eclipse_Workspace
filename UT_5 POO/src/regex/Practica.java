package regex;
import java.util.Scanner;
import java.util.regex.*;
public class Practica {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Introduce una frase: ");
		String texto = teclado.nextLine();
		String regex = "^?[A-Z]|(\\d|\\s|\\d{3})";
		
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.print("Concordancias:\n");
		while(concordancias.find()) {
			System.out.println("Concordancia " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		boolean resultado = texto.matches(".*?[A-Z]|(\\d{3}|(\\s|\\d)).*");
		System.out.println("La coincidencia es " + resultado);
	}
}
