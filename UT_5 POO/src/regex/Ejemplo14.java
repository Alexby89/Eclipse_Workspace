package regex;
import java.util.regex.*;
public class Ejemplo14{
	public static void main(String[] args) {
		String texto = "abc dfgdfgdf asdrabcty"; //Texto con numeros y letras
		String regex = "^[aA]bc.*"; //Cualquier numero del 0 al 9. Equivale a poner[0-9]
		
		//Hacer busquedas y extraer los fragmentos que coinciden 
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		//Comprobar si toda la cadena cumple con la expresion
		boolean res1 = texto.matches("^[aA]bc.*");
		System.out.println("Coindice? " + res1);
	}
}