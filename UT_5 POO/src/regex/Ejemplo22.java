package regex;
public class Ejemplo22{
	public static void main(String[] args) {
		String regex = "(\\w)(\\s+)([\\.,])";		
		System.out.println("Hola  , Esto está regular .".replaceAll(regex, "abc"));
	}
}