package Ejercicio4;
import java.util.Scanner;

public class ProgramaA {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.print("Introduce una cantidad de alumnos: ");
		int cantidad = Integer.parseInt(teclado.nextLine());
		
		if(cantidad <= 0) {
			System.out.println("La cantidad no puede ser 0 o negativa");
		}
		Alumno[] alumnos = obtenerAlumnos(cantidad);
		
		for(int i = 0; i < alumnos.length; i++) {
			for(int j = i+1; j < alumnos.length; j++) {
				String apellidos1 = alumnos[i].getApellidos();
				String apellidos2 = alumnos[j].getApellidos();
				if(apellidos1.compareToIgnoreCase(apellidos2) > 0) {
					Alumno aux = alumnos[i];
					alumnos[i] = alumnos[j];
					alumnos[j] = aux;
				}
			}
		}
		System.out.println("\nAlumnos añadidos y ordenados:");
		for(Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
	}
	
	public static Alumno[] obtenerAlumnos(int cantidad) {
		Alumno[] alumnos = new Alumno [cantidad];
		for(int i = 0; i < alumnos.length; i++) {
			System.out.println((i+1) + "º Alumno:");
			System.out.print("Nombre: ");
			String nombre = teclado.nextLine();
			System.out.print("Apellidos: ");
			String apellidos = teclado.nextLine();
			System.out.print("DNI: ");
			String dni = teclado.nextLine();
			System.out.print("Correo: ");
			String correo = teclado.nextLine();
			
			alumnos[i] = new Alumno(nombre, apellidos, dni, correo);
		}
		return alumnos;
	}
}
