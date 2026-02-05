package Metodos;

import java.util.Scanner;
public class Ejercicio01 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main (String[] args) {
		
		System.out.print("Marca : ");
		String marca = teclado.nextLine().trim();
		
		System.out.print("Modelo : ");
		String modelo = teclado.nextLine().trim();
		
		System.out.print("Año: ");
		int año = Integer.parseInt(teclado.nextLine().trim());
		
		Coches c1 = new Coches(marca, modelo, año);
		System.out.println("Recibiendo datos:");
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		System.out.println(c1.getAño());
	}
}
