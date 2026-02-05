package atributos;
import Ejemplo03.Coche;
public class Ejemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche c1 = new Coche();
		
		c1.marca = "Opel";
		c1.modelo = "Corsa";
		c1.color = "Azul";
		c1.matricula = "1234 CCV";
		
		System.out.println(c1.marca + " " + c1.modelo + " " + c1.color + " (" + c1.matricula + ")");

	}

}
