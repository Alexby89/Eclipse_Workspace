package regex;
import java.util.regex.*;
public class Ejemplo18{
	public static void main(String[] args) {
		String texto = " 1abc abcdefg abcdefghijklmnoapqrstuvwbx"; //Texto con numeros y letras
		String regex = "(a|b|c)+"; //Cualquier numero del 0 al 9. Equivale a poner[0-9]
		
		//Hacer busquedas y extraer los fragmentos que coinciden 
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		//Comprobar si toda la cadena cumple con la expresion
		boolean res1 = texto.matches(".*(a|b)+.*");
		System.out.println("Coindice? " + res1);
	}
}