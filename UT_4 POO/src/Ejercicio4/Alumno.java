package Ejercicio4;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private String correo;
	
	public Alumno(String nombre, String apellidos, String dni, String correo) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String toString() {
		return "Alumno: " + nombre + ", " + apellidos + ", " + dni + ", " + correo;
	}
	
	
}
