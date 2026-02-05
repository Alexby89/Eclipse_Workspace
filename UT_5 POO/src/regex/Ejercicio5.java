package regex;

import java.util.Scanner;

public class Ejercicio5 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce una frase: ");
		String texto = teclado.nextLine();
		
		System.out.println("El texto tiene " + palabras + " palabras");
		
		public static int contarPalabras(String texto) {
			int contador = 0;
			
			String[] partes = texto.split(" ");
			For(int i = 0; i < partes.length; i++){
				if(partes[i].length() > 0) {
					contador++;
				}
			}
			return contador;
		}
	}
}
