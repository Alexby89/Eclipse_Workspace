package Metodos;

import java.util.Scanner;
public class Ejemplo03 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		System.out.print("Especie : ");
		String especie = teclado.nextLine().trim();
		
		System.out.print("Nombre : ");
		String nombre = teclado.nextLine().trim();
		
		System.out.print("Peso: ");
		double peso = Double.parseDouble(teclado.nextLine().trim());
		
		Animal a1 = new Animal(especie, nombre, peso);
		
		System.out.print("Recibiendo datos");
		System.out.println(a1.getEspecie());
		System.out.println(a1.getNombre());
		System.out.println(a1.getPeso());		
	}
}
