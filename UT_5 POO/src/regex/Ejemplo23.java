package regex;
public class Ejemplo23{
	public static void main(String[] args) {
		String regex = "(?i)(<titulo.*?>)(.+?)(</titulo>)";
		String texto = "<titulo>EJEMPLO_TEST</titulo>";
		String actualizada = texto.replaceAll(regex, "$2");
		
		System.out.println("Nuevo original: " + texto);
		System.out.println("Nuevo texto: " + actualizada);
	}
}