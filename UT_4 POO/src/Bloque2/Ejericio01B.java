package Bloque2;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejericio01B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Titular> titulares = obtenerTitulares();
		ArrayList<Movimientos> movimientos = obtenerMovimientos();
	}
	
	public static ArrayList<Titular> obtenerTitulares() {
		ArrayList<Titular> titulares = new ArrayList<Titular>();
		
		File fichero = new Fichero("./Bloque2/Titulares.csv");
		
		try {
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] campos = linea.split(";");
				if(campos.length == 4) {
					Titulares t = new Titulares(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5]);
					titulares.add(t);
				}
			}lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error");
		}
		return titulares;
	}
	
	public static ArrayList<Movimientos> obtenerMovimientos() {
		ArrayList<Movimientos> movimientos = new ArrayList<Movimiento>();
		
		File fichero = new Fichero("./Bloque2/movimiento.csv");
		
		try {
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] campos = linea.split(";");
				if(campos.length == 4) {
					Movimiento m = new Movimiento(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5]);
					movimientos.add(m);
				}
			}lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error");
		}
		return movimientos;
	}
	public static ArrayList<Cuenta02> obtenerCuentas(ArrayList<Titular> titulares, ArrayList<Movimientos> movimiento) {
		ArrayList<Cuenta02> cuentas = new ArrayList<Cuenta02>();
		for(int i = 0; i < cuentas.size(); i++) {
			System.out.println();
			
		}
	}
}
