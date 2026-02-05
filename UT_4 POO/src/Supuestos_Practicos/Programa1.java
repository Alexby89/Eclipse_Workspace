package Supuestos_Practicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;

public class Programa1 {

	public static void main(String[] args) {
		ArrayList<Coordenada> coords = importarCoordenadas();
		
		double distanciaTotal = 0;
		for(int i = 0; i < coords.size()-1; i++) {
			double d = distancia(coords.get(i), coords.get(i+1));
			System.out.println("Distancia entre " + coords.get(i) + " y " + coords.get(i+1) + ": " + d);
			distanciaTotal += d;
		}
		System.out.println("Distancia total entre puntos: " + distanciaTotal);
		
		generarHTML(coords, distanciaTotal);
		
	}

	public static ArrayList<Coordenada> importarCoordenadas() {
		ArrayList<Coordenada> lista = new ArrayList<Coordenada>();
		File fichero = new File("./assets/coordenadas.txt");

		try {
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] campos = linea.split(",");
				if (campos.length == 2) {
					double x = Double.parseDouble(campos[0]);
					double y = Double.parseDouble(campos[1]);
					Coordenada c1 = new Coordenada(x, y);
					lista.add(c1);
				}
			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		}
		return lista;
	}
	
	public static double distancia(Coordenada c1, Coordenada c2) {
		double a = c2.getX() - c1.getX();
		double b = c2.getY() - c1.getY();
		
		return Math.sqrt(a*a + b*b);
	}
	
	public static void generarHTML(ArrayList<Coordenada> lista, double distanciaTotal) {
	    String html = "<!DOCTYPE html>"
	        + "<html><head><title>Lista de coordenadas</title></head>"
	        + "<body>"
	        + "<h1>Listado de coordenadas</h1>"
	        + "<table border='1'>"
	        + "<tr><th>Nº</th><th>Coordenada</th></tr>";

	    for (int i = 0; i < lista.size(); i++) {
	        html += "<tr><td>" + (i + 1) + "</td><td>" + lista.get(i) + "</td></tr>";
	    }

	    html += "<tr><td>Distancia total</td><td>" + distanciaTotal + "</td></tr>";
	    html += "</table></body></html>";

	    try {
	        FileWriter myWriter = new FileWriter("./output/coordenadas.html");
	        myWriter.write(html);
	        myWriter.close();
	    } catch (IOException e) {
	        System.out.println("Error al escribir el archivo");
	    }
	}
}