package atributos;

public class Ejemplo01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		p1.nombre = "Alejandro";
		p1.apellido = "Belando";
		p1.dni = "49855368Q";
		p1.fechaNac = "28/09/2002";
		
		System.out.println("Nombre completo: " + p1.nombre + " " + p1.apellido);
		System.out.println("DNI : " + p1.dni);
		System.out.println("Fecha de nacimiento: " + p1.fechaNac);
		
		System.out.println("\nFin de programa");
	}

}

class Persona{
	public String nombre;
	public String apellido;
	public String dni;
	public String fechaNac;
}