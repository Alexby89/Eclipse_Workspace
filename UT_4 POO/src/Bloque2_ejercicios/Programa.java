package Bloque2_ejercicios;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Introduce tu edad: ");
		int edad = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Introduce el sexo: ");
		char sexo = teclado.nextLine().trim().charAt(0);
		
		System.out.print("Introduce tu peso en kg: ");
		double peso = Double.parseDouble(teclado.nextLine().trim());
		
		System.out.print("Introduce tu nombre: ");
		int altura = Integer.parseInt(teclado.nextLine().trim());
		
		Persona p1 = new Persona(nombre, edad, sexo, altura, peso);
		Persona p2 = new Persona(nombre, edad, sexo);
		Persona p3 = new Persona();
		p3.setNombre("Alejandro");
		p3.setEdad(23);
		p3.setSexo('M');
		p3.setPeso(95);
		p3.setAltura(194);
		
		p1.generarDNI();
		p2.generarDNI();
		p3.generarDNI();
		
		System.out.println(p1);
		int imc = p1.calcularIMC();
		if(imc == )
		System.out.println(p2);
		
		System.out.println(p3);
	}
}
