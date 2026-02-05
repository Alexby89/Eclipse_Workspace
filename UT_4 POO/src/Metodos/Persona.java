package Metodos;

public class Persona {
	public String nombre;
	public String apellidos;
	public String dni;
	public String direccion;
	
	
	public String nombrecompleto() {
		return nombre + " " + apellidos;
	}
}
