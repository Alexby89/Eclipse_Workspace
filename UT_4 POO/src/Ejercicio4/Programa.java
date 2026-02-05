package Ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumno> alumnos = obtenerAlumnos();

		for (int i = 0; i < alumnos.size(); i++) {
			for (int j = i + 1; j < alumnos.size(); j++) {
				String apellidos1 = alumnos.get(i).getApellidos();
				String apellidos2 = alumnos.get(j).getApellidos();
				if (apellidos1.compareToIgnoreCase(apellidos2) > 0) {
					Alumno aux = alumnos.get(i);
					alumnos.set(i, alumnos.get(j));
					alumnos.set(j, aux);
				}
			}
		}
		System.out.println("\nAlumnos añadidos y ordenados:");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}

		generarHTML(alumnos);
	}

	public static ArrayList<Alumno> obtenerAlumnos() {
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		File fichero = new File("./assets/alumnos_poo4.txt");

		try {
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] campos = linea.split(";;");
				if (campos.length == 4) {
					String nombre = campos[0];
					String apellidos = campos[1];
					String dni = campos[2];
					String correo = campos[3];

					Alumno a = new Alumno(nombre, apellidos, dni, correo);
					lista.add(a);
				}
			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no fue encontrado");
		}
		return lista;
	}

	public static void generarHTML(ArrayList<Alumno> alumnos) {

		String html = "<!DOCTYPE html>" + "<html>" + "<head><title>Alumnos</title>"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">"
				+ "</head>" + "<body>" + "<h1>Listado de alumnos</h1>" + "<ul>";

		for (Alumno a : alumnos) {
			html += "<li>" + a + "</li>";
		}

		html += "</ul></body></html>";

		try (FileWriter fichero = new FileWriter("./output/alumnos.html")) {
			fichero.write(html);
			fichero.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
		}
	}
}
