package estatica;

public class Ejemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumnos alu1 = new Alumnos(1, "Alejandro", "Belando", "28/09/2002", "alex.belando.marmol42@gmail.com");
		
		Alumnos alu2 = new Alumnos(2, "Antonio", "Molina", "10/03/2007", "antonioma@gmail.com");
	
		System.out.println("Alumno1: " + alu1.getEmail());
		System.out.println("Alumno2: " + alu2.getEmail());
		
		double resultado = Math.pow(2, 8);
		System.out.println("2 elevado a 8 es " + resultado);
	}
}