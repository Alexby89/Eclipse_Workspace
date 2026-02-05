import java.util.Scanner;

public class Ejemplo06 {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		String[] nombre = {"Jazmin", "Camila", "Martinez", "Rodriguez"};
		System.out.print("El nombre completo es " + String.join(" ", nombre[0], nombre[1], nombre[2], nombre[3]));
	}
}