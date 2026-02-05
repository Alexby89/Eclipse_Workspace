import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ejemplo1 {
	public static void main(String[] args) {
		String texto = "1230abc9c"; //Texto con numeros y letras
		String regex = "\\d"; //Cualquier numero del 0 al 9. Equivale a poner[0-9]
		
		//Hacer busquedas y extraer los fragmentos que coinciden 
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		//Comprobar si toda la cadena cumple con la expresion
		boolean res1 = texto.matches("\\d");
		System.out.println("Coindice? " + res1);
		
		boolean res2 = texto.matches(".*\\d.*");
		System.out.println("Coindice? " + res2);
	}
}