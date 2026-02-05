package Metodos;

import java.util.Scanner;

public class Ejemplo02 {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Estudiante0 e1 = new Estudiante0();
		
		System.out.print("Nombre : ");
		e1.nombre = teclado.nextLine().trim();
		System.out.print("Apellidos : ");
		e1.apellidos = teclado.nextLine().trim();
		
		
		System.out.print("Calificacion: ");
		double nota = Double.parseDouble(teclado.nextLine().trim());
		e1.setCalificacion(nota);
		
		System.out.println(e1.nombre + " " + e1.apellidos + ". Calificacion: " + e1.getCalificacion());
		
	}
}
