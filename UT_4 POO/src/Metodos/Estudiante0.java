package Metodos;

public class Estudiante0 {
	public String nombre;
	public String apellidos;
	private double calificacion;
	
	public double getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(double calificacion) {
		if(calificacion >= 0 && calificacion <= 10) {
		this.calificacion = calificacion;
		}
	}
}
